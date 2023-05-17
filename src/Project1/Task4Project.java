package Project1;

public class Task4Project {
    public static void main(String[] args) {


        int sumOfOdd=0;
        int sumOfEven=0;

            int[][] arr2D= {{0,1,2,3,4,5,6,7,8},
                    {90,91,92,93,86,95,96}};


            for (int i = 0; i < arr2D.length; i++) {
                for (int j = 0; j < arr2D[i].length; j++) {
                    if (arr2D[i][j]% 2 == 0) {
                        sumOfOdd+=arr2D[i][j];
                    }else{
                        sumOfEven+=arr2D[i][j];
                    }

                }
            }

        System.out.println(sumOfOdd);
        System.out.println(sumOfEven);


        }
    }

