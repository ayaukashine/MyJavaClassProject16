package class5;

import java.util.Scanner;

public class E4NestedIf {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);*/
        int money=2000;
        String day="Monday";
        if(money>1000){
            if(day.equals("Sunday")){
                System.out.println("Lets go shopping");
            }
            if(day.equals("Monday")){
                System.out.println("Lets go eat");
            }
        }
    }
}
