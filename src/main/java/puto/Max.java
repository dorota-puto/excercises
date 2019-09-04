package puto;

public class Max {
    public int calculateMax(int[] a) {
        int current = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > current) {
                current = a[i];
            }
        }
        return current;
    }

    public static void main(String[] args) {
        Max max = new Max();
        int[] arr = {1, 3, 5, 8, 2, 1};
        int w = max.calculateMax(arr);
        System.out.println(w);

    }
}
