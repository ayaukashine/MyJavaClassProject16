package class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of fruit Gaukhar likes?");
        String fruit = scanner.next();
        if (fruit.equals("Mango")) {
            System.out.println("You are right!");
        } else if (fruit.equals("Apple")) {
            System.out.println("You are wrong!");
        } else if (fruit.equals("Orange")) ;
        {
            System.out.println("Try another one");
        }
    }
}
