package class15;

public class E2 {
    /*void method1(){
        System.out.println("hello World");
    }*/
    int sumArr(int [] arr){

        int sum=0;
        for (int i = 0; i < arr.length; i++) {

            sum=sum+arr[i];

        }

        return sum;

    }

    public static void main(String[] args) {
        E2 e2=new E2();

        int sum = e2.sumArr(new int []{10,10,20});
        System.out.println(sum);
    }



    void method1(){
        System.out.println("Hello World");
    }
}

