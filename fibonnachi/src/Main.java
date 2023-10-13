import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Задача 1
    /*public static void main(String[] args) {
        int[] arr = new int[40];
        arr[0] = 1;
        arr[1] = 1;
        for( int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() - 1;
        System.out.println(arr[n]);
    }*/
//Задача 2
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10000000];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
        }
        int n = scanner.nextInt() - 1;
        System.out.println(arr[n]);
    }*/
//Задача 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long size = m * 6;
        List<Integer> period = new ArrayList<>();
        period.add(0);
        period.add(1);
        period.add(1);
        for (int i = 3; i < size; i++) {
            long modFib = (period.get(i - 2) + period.get(i - 1)) % m;
            if (modFib == 1 && period.get(i - 1) == 0) {
                period.remove(i - 1);
                break;
            }
            period.add((int) modFib);
        }

        System.out.println((period.get((int) (n % period.size()))) % m);

    }
}