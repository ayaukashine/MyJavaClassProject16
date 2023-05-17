package class10;

public class E5D2Array {
    public static void main(String[] args) {

        int [] [] matrix= {
                {30,50,60,100,150},
                {20,90,63,15},
                {95,61,47},
                {12,58},
                {5}
        };
        for (int i = 0; i < matrix.length; i++) {
          //  int[] arr1=matrix[i];
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }

    }
}
