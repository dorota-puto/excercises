package puto.spoj;

public class Fibonacci {

    public static int fibRec(int n) {
        int i;
        int result = 1;
        for (i = 2; i < n; i++) {
            result = fib(n - 1) + fib(n - 2);
        }
        return result;
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int x = 0;
        int y = 1;
        int z = 1;
        for (int i = 2; i <= n; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        return z;

    }


    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
    }
}
