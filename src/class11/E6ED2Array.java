package class11;

public class E6ED2Array {
    public static void main(String[] args) {
        int [] [] arr={{10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}};


        int counter=0;
        for (int[] arr1D : arr) {
            for (int num : arr1D) {
               counter=counter+num;}
                System.out.print(counter+" ");
counter=0;



        }
    }
}
