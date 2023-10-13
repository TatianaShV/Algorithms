
// нахождение числа фиббоначи через остаток
public class Fib {
    private static final int MOD = (int) (1e9 + 7);// 10 в 9 степени

    private int fibbonachi(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = (a + b) % MOD;
            a = b;
            b = c;
        }
        return a;
    }

    public void run(int n) {
        System.out.println(n + " = " + fibbonachi(n));
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new Fib().run(100000);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");

    }
}
