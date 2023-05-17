package TestBatch16;

public class testRepl115 {

    boolean ifEven(int a, int b) {

        boolean its=false;

        if (a % 2 == 0 && b % 2 == 0) {
           its = true;

        } else if(a % 2 == 1 || b % 2 == 1){
            its=false;
        }

       return its;

    }
        public static void main(String [] args){

        testRepl115 obj=new testRepl115();
        boolean result=obj.ifEven(4,5);
            System.out.println(result);

        }

    }

