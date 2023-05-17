package class5;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

           int counter=0;;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    if (a[i][j] % 2 != 0) {
                        counter = a[i][j] + counter;
                    }
                }

            }
        }

        System.out.println(counter);

    }}









