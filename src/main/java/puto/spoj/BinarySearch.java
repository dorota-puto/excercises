package puto.spoj;

public class BinarySearch {
    public static int binarySearch(int[] tab, int numberToFind) {
        int start = 0;
        int end = tab.length;
        int result = 0;
        while (start<end) {
            int middle = (end - start) / 2;

            if (numberToFind < tab[middle]) {
                end = middle;
            }else
            if (numberToFind > tab[middle]) {
                start = middle;
            } else {
                return middle;
            }
        }
        return -1;
    }


    public static void main(String[] args){

        int[]tab={1,2,4,8,10,12,13};
        int number= 2;
        System.out.println(binarySearch(tab,number));

        int number2= 1;
        System.out.println(binarySearch(tab,number2));

        int number3= 10;
        System.out.println(binarySearch(tab,number3));

        int number4= 13;
        System.out.println(binarySearch(tab,number4));

        int number5= 7;
        System.out.println(binarySearch(tab,number5));
    }
}
