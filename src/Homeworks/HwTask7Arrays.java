package Homeworks;

public class HwTask7Arrays {
    public static void main(String[] args) {

        int [] number={12,9,-6,1900,523,69778,26};

        int largestNumber=number[4];
        for (int num : number) {
            if (num>largestNumber){

                largestNumber=num;
            }


        }
        System.out.println(largestNumber);
    }
}
