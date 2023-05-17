package class15;

public class E1 {
    
    int [] createArray(int size){
        
     int [] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=10;
        }
        return arr;
    }


    public static void main(String[] args) {
        E1 obj=new E1();
        int[] array = obj.createArray(5);
      //  System.out.println(Arrays.toString(array));
       /* for (int i : array) {
            System.out.println(i);*/

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        }
    }

