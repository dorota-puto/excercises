package puto.spoj;

import java.util.Scanner;

public class Ptest {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();

            Integer a = Integer.parseInt(line1);
            Integer b = Integer.parseInt(line2);

            int result = a+b;
            System.out.println(""+result);
    }
}
