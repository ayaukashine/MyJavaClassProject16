package class4;

import java.util.Scanner;

public class Hw3Class4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=scanner.nextInt();
        if(age>18){
            System.out.println("We will issue a driver license");
        }else{
            System.out.println("You can apply only for a permit");
        }
    }
}
