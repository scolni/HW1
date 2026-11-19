import java.math.BigInteger;

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // Build the first x Fibonacci numbers.
        ////////////////////////////////////////////////////////////////
        BigInteger[] fibonacci = new BigInteger[x];
        fibonacci[0] = BigInteger.ONE;
        fibonacci[1] = BigInteger.ONE;

        for (int i = 2; i < x; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }
        ////////////////////////////////////////////////////////////////

        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(fibonacci[i]);
            if (fibonacci[i].testBit(0)) {
                numOdd++;
            }
            if (i < x - 1) {
                System.out.print(" "); // Make sure we don't print a trailing space
            }
        }
        System.out.println();

        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
