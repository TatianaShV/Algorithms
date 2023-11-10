package groupId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new BinarySearch().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            }
        }

        int countK = scanner.nextInt();
        int[] k = new int[countK];
        for (int i = 0; i < countK; i++) {
            if (scanner.hasNextInt()) {
                k[i] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(k));
        for (int i : k) {
            list.add(search(arr, i));
        }
        for (int j : list) {
            System.out.print(j);
            System.out.print(" ");
        }
    }

    public int search(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == k) {
                return m +1;

            } else if (arr[m] > k) {
                r = m - 1;
                continue;
            } else if (arr[m] < k) {
                l = m + 1;
            }
        }
        return -1;
    }
}
