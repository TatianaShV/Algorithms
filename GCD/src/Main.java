import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //  нахождение НОД по алгоритму Евклида

                Scanner scanner = new Scanner(System.in);

                long a = scanner.nextLong();
                long b = scanner.nextLong();
                while (true) {
                    if (a == 0 || b == 0) {
                        break;
                    }
                    if (a >= b) {
                        a = a % b;
                    } else {
                        b = b % a;
                    }
                }
                long nod = (a == 0) ? b : a;
                System.out.println(nod);
            }
        }
    }
}