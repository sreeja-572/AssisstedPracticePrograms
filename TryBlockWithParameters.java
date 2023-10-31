package AssistedPractice;

public class TryBlockWithParameters {
    public static void main(String[] args) {
        try {
            int n = 100;
            int d = 0;

            int res = divide(n, d);

            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    static int divide(int n, int d) {
        if (d == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return n / d;
    }
}