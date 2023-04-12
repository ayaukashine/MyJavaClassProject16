package Homeworks;

import java.util.Scanner;

public class E6HomeWork {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please use it as a calculator");
        int number1=scan.nextInt();
        int symbol= scan.nextInt();
        int number2= scan.nextInt();
       int sum=scan.nextInt();


        if(number1>0){
            System.out.println(number1+""+symbol+""+number2+"="+sum);

        }

    }
}
