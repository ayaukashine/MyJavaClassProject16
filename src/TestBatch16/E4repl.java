package TestBatch16;

import com.sun.tools.javac.Main;

public class E4repl {


        int number(int num)

        { int numb=0;
            for (int i=0; i<10; i++){
                numb=numb+1;
                System.out.println(numb);
        }
            return numb;
        }

        public static void main (String [] args){

            E4repl obj=new E4repl();
           //int num=10;
            int result=obj.number(1);


        }


    }

