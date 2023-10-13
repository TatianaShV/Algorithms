import java.util.Scanner;

public class Task2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10000000];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
        }
        int n = scanner.nextInt() - 1;
        System.out.println(arr[n]);
    }
}
