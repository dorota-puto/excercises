package puto.spoj;

public class MatricesMultiply {
    public static int[][] matricesMultiply(int[][] first, int[][] second) {

        int[][] result = new int[first.length][second[0].length];

        for(int i=0; i<first.length; i++){
            for(int j=0; j<second[0].length; j++){
                for(int k=0; k<first[0].length; k++){
                    result[i][j]+=first[i][k]*second[k][j];
                }
            }
        }
return result;
}

    public static void main(String[] args) {

        int[][] first= {{5,2,1},
                        {1,3,6}
        };

        int[][] second= {{1,4},
                         {2,5},
                         {3,6}
        };

        for(int i = 0; i <first.length; i++)
        {
            for(int j = 0; j < second[0].length; j++)
            {
                System.out.printf("%5d ", matricesMultiply(first,second)[i][j]);
            }
            System.out.println();

    }

}}
