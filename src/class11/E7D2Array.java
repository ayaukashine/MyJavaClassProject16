package class11;

public class E7D2Array {
    public static void main(String[] args) {
        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}};

        int counter = 0;
        for (boolean[] booleans : arr2D) {
            for (boolean aBoolean : booleans) {
                if (aBoolean == true) {
                    counter=counter+1;

                }

            }

        }
        System.out.println(counter);

    }
}

