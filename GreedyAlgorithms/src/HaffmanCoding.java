import java.util.*;

public class HaffmanCoding {
    class Node implements Comparable<Node> {
        final int sum;
        String code;

        void buildCode(String code) {
            this.code = code;
        }

        public Node(int sum) {
            this.sum = sum;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(sum, o.sum);
        }
    }

    class MidNode extends Node {
        Node right;
        Node left;

        public MidNode(Node left, Node right) {
            super(right.sum + left.sum);
            this.right = right;
            this.left = left;
        }

        @Override
        void buildCode(String code) {
            super.buildCode(code);
            left.buildCode(code + "0");
            right.buildCode(code + "1");
        }
    }

    class LeafNode extends Node {
        char simbol;

        public LeafNode(char simbol, int count) {
            super(count);
            this.simbol = simbol;
        }

        @Override
        void buildCode(String code) {
            super.buildCode(code);
            System.out.println(simbol + " : " + code);
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char letter : chars) {
            Integer repeat = map.get(letter);
            if (repeat == null) {
                map.put(letter, 1);
            } else {
                map.put(letter, ++repeat);
            }
        }
        Map<Character, Node> codeChar = new HashMap<>();
        Queue<Node> queue = new PriorityQueue<>();
        int count = 0;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            Node node = new LeafNode(kv.getKey(), kv.getValue());
            queue.offer(node);
            codeChar.put(kv.getKey(), node);
        }
        if (map.size() == 1) {
            count = chars.length;
        }
        while (queue.size() > 1) {
            Node first = queue.poll();
            Node second = queue.poll();
            Node node = new MidNode(first, second);
            queue.offer(node);
            count += node.sum;
        }
        System.out.println(map.size() + " " + count);
        Node root = queue.poll();
        if (map.size() == 1) {
            root.buildCode("0");
        } else {
            root.buildCode("");
        }
        String encodingString = "";
        for (char c : chars) {
            encodingString += codeChar.get(c).code;
        }
        System.out.println(encodingString);
    }

    public static void main(String[] args) {
        new HaffmanCoding().run();
    }
}
