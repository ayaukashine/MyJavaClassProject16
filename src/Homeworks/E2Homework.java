package Homeworks;

import java.util.Scanner;

public class E2Homework {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a number");
        int number=scanner.nextInt();
        if(number<11){
            System.out.println("It is a small number");
        } else if (number<12 || number<101) {
            System.out.println("It`s a medium number");
        }else{
            System.out.println("It`s large number");
        }
    }
}
