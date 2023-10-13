import java.util.*;

public class GreedyAlgorithms1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int countLine = Integer.parseInt(s);
        int[][] lines = new int[countLine][2];
        for (int i = 0; i < countLine; i++) {
            String n = scanner.nextLine();
            String[] parts = n.split(" ");
            lines[i][0] = Integer.parseInt(parts[0]);
            lines[i][1] = Integer.parseInt(parts[1]);
        }
        Arrays.sort(lines, (a, b) -> Integer.compare(a[1], b[1]));
        System.out.println(Arrays.deepToString(lines));
        List<Integer> list = new ArrayList<>();
        list.add(lines[0][1]);
        int r0 = lines[0][1];
        for (int i = 1; i < lines.length; i++) {
            if (lines[i][0] > r0) {
                list.add(lines[i][1]);
                r0 = lines[i][1];
            }
            if (lines[i][0] == r0) {
                if (!list.contains(r0)) {
                    list.add(lines[i][1]);
                    r0 = lines[i][1];
                }
            }
        }
        System.out.println(list.size());
        for (int m : list) {
            System.out.print(m);
            System.out.print(" ");
        }
    }
}