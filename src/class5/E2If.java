package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("is it time for break true/false");
        boolean isBreak=input.nextBoolean();
        if(isBreak){
            System.out.println("Let`s have a break");
        }
    }
}
