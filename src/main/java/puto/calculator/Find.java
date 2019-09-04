package puto.calculator;

public class Find {
    public Integer binarySearch(int[] a, int b) {
        int s = 0;
        int e = a.length;
        int result = -1;
        while (result < 0 && s < e) {
            int middle = (s + e) / 2;

            if (b < a[middle]) {
                e = middle;
            } else if (b > a[middle]) {
                s = middle;
            } else {
                result = middle;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Find find= new Find();
        int[]a={1,3,4,5,7,11,15,18,21,23,25};
        int b= 7;
        int index= find.binarySearch(a,b);
        System.out.println(index);
    }
}
