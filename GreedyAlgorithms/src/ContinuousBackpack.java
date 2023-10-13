import java.util.Arrays;
import java.util.Scanner;

public class ContinuousBackpack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] parts = s.split(" ");
        int count = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);

        double[][] items = new double[count][2];
        for (int i = 0; i < count; i++) {
            String n = scanner.nextLine();
            String[] p = n.split(" ");
            items[i][0] = Double.parseDouble(p[0]);
            items[i][1] = Double.parseDouble(p[1]);

        }
        Arrays.sort(items, (a, b) -> Double.compare(b[0] / b[1], a[0] / a[1]));
        System.out.println(Arrays.deepToString(items));
        double sum = 0;

        for (int i = 0; i < items.length; i++) {
            if (w == 0) break;
            if (w >= items[i][1]) {
                w -= items[i][1];
                sum += items[i][0];
            } else {
                sum += items[i][0] / items[i][1] * w;
                w = 0;
            }
        }

        System.out.println(String.format("%.3f",sum));
    }
}
