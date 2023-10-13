import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[40];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() - 1;
        System.out.println(arr[n]);
    }
}