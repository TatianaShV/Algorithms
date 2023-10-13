import java.util.*;

public class AlgorithmOfHaffman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        // int [] frequency = new int[chars.length];
        Map<Character, Integer> map = new HashMap<>();

        for (char letter : chars) {
            Integer repeat = map.get(letter);
            if (repeat == null) {
                map.put(letter, 1);
            } else {
                map.put(letter, ++repeat);
            }
        }
        Queue<Integer> q = new PriorityQueue<>();
        for(Map.Entry<Character,Integer> kv: map.entrySet()){
           q.offer(kv.getValue());
            System.out.println(kv.getKey() + " : " + kv.getValue());
        }
        System.out.println(q);
    }


}
