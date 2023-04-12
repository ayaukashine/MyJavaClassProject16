package class6;

import java.util.Scanner;

public class E4LogicOperators {
    public static void main(String[] args) {
     /*int height=60;
      if(height>80 || height>90){
          System.out.println("Short height");

      } else if (height<70 && height<70) {
          System.out.println("Medium");
          
      } else if (!(height<72)) {
          System.out.println("Tall");

      } */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your height");
        int height= scanner.nextInt();
        if(height<60){
            System.out.println("Short");
        } else if (height>=60 && height<=72) {
            System.out.println("Medium");
        } else  {
            System.out.println("Tall");

        }

    }
}
