package TestBatch16;

import java.util.Scanner;

public class testrepl104 {

    String name(String call) {

        for (int i = 0; i < 1; i++) {

            System.out.print(call.substring(0, 3));
        }return call;
    }

        public static void main (String[]args){
            testrepl104 obj = new testrepl104();
            Scanner scanner = new Scanner(System.in);
            String call = scanner.nextLine();
            obj.name(call);

        }
    }

