package TestBatch16;

public class Repl141 {

    public static int maxValue(int[] array){
         int total=0;


         int sum=0;
           int sum2=0;
        for(int i=0; i<array.length; i++){

             sum=array[i];

             if(sum>sum2){
              total=sum;
            }
             sum2=array[i];


        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,25,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }

}
