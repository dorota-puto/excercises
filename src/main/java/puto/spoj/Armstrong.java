package puto.spoj;

public class Armstrong {

    public static boolean isArmstrong(int a) {
        int i = 1;
        int j = i * 10;
        int sum = 0;
        while (a / i >= 1) {
            int x = (a % j - a % i) / i;
            i = j;
            j = i * 10;
            sum = sum + (int)Math.pow(x,3);
        }
        return sum == a;
    }
    public static void main(String[] args) {
        System.out.println("is 153 an armstrong number? " + isArmstrong(153));
        System.out.println("is 555 an armstrong number? " + isArmstrong(555));
        System.out.println("is 1 an armstrong number? " + isArmstrong(1));
    }
}
