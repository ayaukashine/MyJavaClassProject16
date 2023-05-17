package TestBatch16;

import java.util.Scanner;

public class E1testRepl {


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below


        for (int i = 0; i < word.length(); i+=2) {
          {
                System.out.print(word.charAt(i));
            }

        }

    }
}
