import java.util.*;

public class GreedyAlgorithms3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> k = new HashSet<>();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n - i > (s + i)) {
                s += i;
                k.add(i);
            } else {
                k.add(n - s);
                break;
            }
        }
        System.out.println(k.size());
        for (int b : k) {
            System.out.print(b);
            System.out.print(" ");
        }
    }
}

