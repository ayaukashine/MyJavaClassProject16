package Homeworks;

import java.util.Scanner;

public class E5HomeWork {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your score");
        int score=scan.nextInt();
        if(score>=90){
            System.out.println("Your garde is A");
        }else if(score>=70 || score>90){
            System.out.println("Your grade is B");
        }else if (score>50 || score>70){
            System.out.println("Your grade is C");}
            else if(score<50){
                System.out.println("Your grade is F");
            }
            else{
            System.out.println("Not acceptable");
        }
    }
}