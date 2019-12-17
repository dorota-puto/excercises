package puto.spoj;

public class Euclid {
    public static Integer GCD(int a ,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main (String[] args){
        System.out.println("GCD of 2446 and 2365489: " + GCD(2446,2365489));
        System.out.println("GCD of 24 and 12: " + GCD(24,12));
    }
}
