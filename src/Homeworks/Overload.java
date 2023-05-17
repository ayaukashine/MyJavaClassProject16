package Homeworks;
/*
        Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
        Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.*/
public class Overload {

    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, double b){
        System.out.println(a+b);
    }
    static void add(int a, int b, long k){
        System.out.println(a+b*k);
    }


    public static void main(String[] args) {
        add(5,6);
        add(7,7.2);
        add(5,6,9999);
    }
}
