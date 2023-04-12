package Homeworks;

import java.util.Scanner;

public class E3Homework {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter time on 24 hour format");
        int time=scanner.nextInt();

        if(time<11 && time!=0)
        {System.out.println("It is a Morning time");}
        else if(time<16 && time!=0){
            System.out.println("Its an Afternoon time");
        }else if(time<21 && time!=0){
            System.out.println("Its an Evening time");
        }else if(time<25 && time!=0){
            System.out.println("Its a Night time");
        }else{
            System.out.println("Invalid number");
        }

    }
}
