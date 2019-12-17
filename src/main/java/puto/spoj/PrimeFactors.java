package puto.spoj;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> primeFactors(int n) {

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                list.add(i);
                n = n / i;
            }
        }
        if (n > 1) {
            list.add(n);
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("prime factors of " + n +": "+ primeFactors(n));
    }

}
