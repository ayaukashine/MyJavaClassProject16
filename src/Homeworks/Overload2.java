package Homeworks;

public class Overload2 {


    private static void add(int a,int b){
        System.out.println(a+b);
    }

    private static void add(double a, int b, long k){

        System.out.println(a+b+k);
    }

    private static void add(int a,int b, int c){
        System.out.println(a+b+c);
}

    public static void main(String[] args) {
        add(5,9);
        add(5.2,6,55555);
        add(4,6,9);
    }

}