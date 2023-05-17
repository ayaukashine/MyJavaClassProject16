package class10;

public class E3Class2DArrays {
    public static void main(String[] args) {

        int [] [] matrix= {
                {30,50,60},
                {20,90,63},
                {95,61,47}
        };


        int [] arr1=matrix[0];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");

        }
        System.out.println();
         arr1=matrix[1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");

        }
        System.out.println();
         arr1=matrix[2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");

        }


    }
}
