package TestBatch16;

import java.util.Scanner;

public class E2TestRepl {


    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        String word2 = "";
        for (int i = 0; i < word.length(); i += 1) {
            word2 = word2 + word.charAt(i);

            word2="";
            }
        System.out.println(word2);

        }

    }


