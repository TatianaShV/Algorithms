
import java.util.*;

public class HaffmanDecoding {
    public String charArrayToString(char[] arr) {
        String result = "";
        for (int i = 3; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            result += sb.append(arr[i]);
        }
        return result;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int lettersNumber = Integer.parseInt(input[0]);
        int codeNumber = Integer.parseInt(input[1]);
        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < lettersNumber; i++) {
            char[] s = scanner.nextLine().toCharArray();
            if (s.length == 3) {
                map.put(String.valueOf(s[3]), s[0]);
            }
            if (s.length > 3) {
                String letterCode = charArrayToString(s);
                map.put(letterCode, s[0]);
            }
        }
        String stringCode = scanner.nextLine();
        String decoding = "";
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < codeNumber; i++) {

            decoding += String.valueOf(sb.append(stringCode.charAt(i)));

            if (map.containsKey(decoding)) {
                list.add(map.get(decoding));
                sb = new StringBuilder();
                decoding = "";
            } else if (!map.containsKey(decoding)) {
                sb = new StringBuilder();
                continue;
            }
        }
        for (char l : list) {
            System.out.print(l);
        }
    }

    public static void main(String[] args) {
        new HaffmanDecoding().run();
    }
}
