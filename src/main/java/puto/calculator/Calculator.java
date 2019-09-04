package puto.calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Calculator {


    public Integer add(Integer a, Integer b) {
        return a + b;
    }
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }
    public Double div(Integer a, Integer b) {
        return (double) a/b;

    }
    public Integer fac(Integer n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
        }
        return f;
    }
    public int[][] tab (Integer x) {
        int[][] w = new int[x][x];
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                 w[i-1][j-1] = i*j;
            }
        }
        return w;
    }

}
