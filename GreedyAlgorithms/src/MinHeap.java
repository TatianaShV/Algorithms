import java.util.*;

public class MinHeap {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new MinHeap().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();
        int operationsNumber = Integer.parseInt(scanner.nextLine());//scanner.nextInt();
        for (int i = 0; i < operationsNumber; i++) {
            String input = scanner.nextLine();
            String[] operation = input.split(" ");

            switch (operation[0]) {
                case "Insert":
                    int a = Integer.parseInt(operation[1]);
                    if (arr.isEmpty()) {
                        arr.add(a);
                    } else {
                        arr.add(a);
                        insert(a, arr);
                    }
                    break;
                case "ExtractMax":
                    if (!arr.isEmpty()) {
                        extractMax(arr, maxList);
                    }
                    break;
            }
        }
        for (int max : maxList) {
            System.out.println(max);
        }
    }

    public void extractMax(List<Integer> arr, List<Integer> maxList) {
        int indexLast = arr.size();
        List<Integer> l = arr.subList((indexLast - 1) / 2, indexLast);
        int max = Collections.max(l);

        maxList.add(max);
        if (arr.indexOf(max) == arr.size() - 1) {
            arr.remove((Integer) max);
        } else {
            int b = arr.get(arr.size() - 1);
            arr.set(arr.indexOf(max), b);
            arr.remove(arr.size() - 1);
            insert(b, arr);
        }

    }
    public List<Integer> insert(int a, List<Integer> arr) {
        while (true) {
            int i = arr.indexOf(a);
            if ((arr.get(i) < arr.get((i - 1) / 2))) {
                int x = arr.get((i - 1) / 2);
                arr.set(((i - 1) / 2), a);
                arr.set(i, x);
            } else if ((arr.get(i) >= arr.get((i - 1) / 2))) {
                break;
            }
        }
        return arr;
    }
}
