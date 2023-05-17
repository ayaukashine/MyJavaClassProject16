package class10;

public class E4Class2DArrays {
    public static void main(String[] args) {



          int [] [] matrix= {
                {30,50,60},
                {20,90,63},
                {95,61,47}
        };


        for (int i = 0; i < matrix.length; i++) {
            int []arr1=matrix[i];
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j]+ " ");
            }
            System.out.println();
        }
    }
}
