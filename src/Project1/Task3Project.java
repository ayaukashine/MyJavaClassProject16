package Project1;

public class Task3Project {
    public static void main(String[] args) {

        int[][] arr2D = {
                {0,1,3},
                {90,91,92,94},
                {83,84,85,86,87},
                {77,78,79,80,81,69}
        };


        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (j% 2 == 0) {
                    System.out.print(arr2D[i][j]+" ");

                }

            }
            System.out.println();
        }

    }
}
