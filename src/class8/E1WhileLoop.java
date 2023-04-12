package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter starting and ending number");
        int start=scan.nextInt();
        int end=scan.nextInt();
        int step=scan.nextInt();
      int number=start;
      while(number<=end){
          System.out.print(number+" ");
          number=number+step;
      }



    }
}
