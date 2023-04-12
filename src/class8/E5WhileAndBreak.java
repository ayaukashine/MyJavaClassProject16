package class8;

import java.util.Scanner;

public class E5WhileAndBreak {
    public static void main(String[] args) {

        boolean summer = true;
        int temp = 85;
        while (summer) {
            if (temp < 100) {
                System.out.println("Its good I enjoy summer");
            } else {
                System.out.println("Its very hot");
                break;
            }
            temp = temp + 2;
        }
    }
}