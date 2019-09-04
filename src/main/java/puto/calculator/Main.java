package puto.calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Calculator calculator = new Calculator();
        int c = calculator.add(1,2);
        System.out.println("a+b=" + c);

        double d = calculator.div(5,0);
        System.out.println("a/b=" + d);

        int f = calculator.fac(4);
        System.out.println("fac=" + f);

        int[][] g = calculator.tab(5);
        System.out.println(g);

        List<Integer> x = new ArrayList<>();
        x.add(2);
        x.add(3);
        System.out.println(x);

    }
}
