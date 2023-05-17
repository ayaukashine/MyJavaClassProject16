package Project1;

public class Task6Project {

    // prime numbers are 2,3,5,7,11,13,17,19,

    public static void main(String[] args) {
        int[] arr1 = {11,12,5, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,21,22,23};
      //  int number = 0;
        for (int i = 0; i < arr1.length; i++) {

            int number=arr1[i];
            if (number % 2 != 0) {
                System.out.println(arr1[i]);

            }


        }
    }
}
