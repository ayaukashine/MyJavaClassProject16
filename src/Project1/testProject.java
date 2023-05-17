package Project1;

public class testProject {
    public static void main(String[] args) {
        int evenSum=0;
        int oddSum=0;
        int[][] arr = {
                {0,1,3,2,6},
                {1,3,2,4,5},
                {0,0,10,9}
        };
        // We need iterate over the 2D Array

        for(int i =0 ;i<arr.length;i++) {
            // we are getting row information
            for(int j =0 ;j<arr[i].length;j++) {
                if(arr[i][j]%2==0) {
                    //System.out.print(arr[i][j]+" ");
                    evenSum +=arr[i][j];
                }
                else {
                    oddSum +=arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Only Even: " +evenSum);
        System.out.println("Only Odd: " +oddSum);
    }
}
