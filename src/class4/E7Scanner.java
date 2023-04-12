package class4;

import java.util.Scanner;

public class E7Scanner {
    /*public static void main(String[] args) {
        Scanner apple= new Scanner(System.in);
        System.out.println("What fruit would you prefer?");
        String fruit=apple.next();


        if(fruit.equals("Orange")){
            System.out.println("Loves it");
        }else{
            System.out.println("Hates it");
        }

    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your name");
        String name=scanner.next();

        if(name.equals("Aya")){
            System.out.println("Mac users");
        }else if (name.equals("Safyan")){
            System.out.println("Naughty");
        }else if(name.equals("Halima")){
            System.out.println("Best");
        } else if (name.equals("Alex")) {
            System.out.println("Bad boy");

        }

    }

}
