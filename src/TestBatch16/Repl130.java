package TestBatch16;

public class Repl130 {




   public static void mystery(int[] array) {

        int sum=0;
        for (int i = 0; i < array.length; i++) {

            if (array.length % 2 == 0) {

                sum =sum+ array.length;
            } else if (array.length % 2 == 1) {
                sum = array.length * 10;
            }

        } return sum;
}

public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        mystery(a);

        // should print out 10 1 30 2 50
    }
}
