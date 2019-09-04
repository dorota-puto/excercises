package puto;

public class Primary {
    public boolean isPrimaryNumber (int a) {
        for (int i=2; i<a; i++) {
            if (a%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Primary primary = new Primary();
        System.out.println("2 is prime: " + primary.isPrimaryNumber(2));
        System.out.println("5 is prime: " + primary.isPrimaryNumber(5));
        System.out.println("6 is prime: " + primary.isPrimaryNumber(6));
        System.out.println("27 is prime: " + primary.isPrimaryNumber(27));
    }
}
