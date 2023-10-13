import java.math.BigInteger;

public class GCD {
    private BigInteger gcd(BigInteger a, BigInteger b) {
        while (true) {
            System.out.println(a + " " + b);
            if (a.equals(BigInteger.ZERO)) return b;
            if (b.equals(BigInteger.ZERO)) return a;
            if (a.compareTo(b) >= 0) { // a >= b
                // a, b = a %b, b
                a = a.mod(b);
            } else {
                b = b.mod(a);  // b %= a;
            }
        }
    }

    private void run() {
        BigInteger a = new BigInteger("156846516525465415");
        BigInteger b = new BigInteger("1546541651655445");
        System.out.println(gcd(a,b));
        // есть встроенный метод         a.gcd(b);
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new GCD().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");

    }
}
