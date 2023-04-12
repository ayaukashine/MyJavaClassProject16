package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= input.nextInt();
        if(age<18){
            System.out.println("You can`t drive");
        }else {
            System.out.println("Yes, you can drive");
        }
    }
}
