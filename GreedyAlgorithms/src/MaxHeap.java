import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxHeap {
    public static void main(String[] args) {
        new MaxHeap().run();
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        arr.add(2000000000);
        List<Integer> maxList = new ArrayList<>();
        int operationsNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < operationsNumber; i++) {
            String input = scanner.nextLine();
            String[] operation = input.split(" ");
            switch (operation[0]) {
                case "Insert":
                    int a = Integer.parseInt(operation[1]);
                    if (arr.size() == 1) {
                        arr.add(a);
                    } else {
                        arr.add(a);
                        insert(a, arr);
                    }
                    break;
                case "ExtractMax":
                    if (arr.size() != 1) {
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

        int max = arr.get(1);
        maxList.add(max);
        int indexLast = arr.size() - 1;
        arr.set(1, arr.get(indexLast));
        arr.remove(indexLast);
        if (arr.size() > 2) {
            shutDown(arr, arr.get(1));
        }
    }

    public void shutDown(List<Integer> arr, int a) {
        int i = 1;
        while (true) {
            if (arr.size() == 3) {
                if (a >= arr.get(2)) {
                    break;
                } else {
                    arr.set(1, arr.get(2));
                    arr.set(2, a);
                    break;
                }
            }
            if (arr.size() > 3) {
                if (2 * i < arr.size()) {
                    int l = arr.get(2 * i);
                    if (2 * i + 1 < arr.size()) {
                        int r = arr.get(2 * i + 1);
                        if (a > l && a > r) {
                            break;
                        }
                        if (a <= l || a <= r) {
                            if (l >= r) {
                                arr.set(i, l);
                                arr.set(2 * i, a);
                                i = 2 * i;
                            } else {
                                arr.set(i, r);
                                arr.set(2 * i + 1, a);
                                i = 2 * i + 1;
                            }
                        }

                    } else {
                        if (a >= l) {
                            break;
                        } else {
                            arr.set(i, l);
                            arr.set(2 * i, a);
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        }
    }

    public List<Integer> insert(int a, List<Integer> arr) {
        int i = arr.size() - 1;
        while (true) {
            if (a > arr.get(i / 2)) {
                int x = arr.get(i / 2);
                arr.set(i / 2, a);
                arr.set(i, x);
                i = i / 2;
            } else if (a <= arr.get(i / 2)) {
                break;
            }
        }
        return arr;
    }
}

