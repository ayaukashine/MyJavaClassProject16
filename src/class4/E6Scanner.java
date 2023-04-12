package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner apple= new Scanner(System.in);
        System.out.println("What fruit would you prefer?");
        String fruit=apple.next();


        if(fruit.equals("Orange")){
            System.out.println("Loves it");
        }else{
            System.out.println("Hates it");
        }

    }
}
