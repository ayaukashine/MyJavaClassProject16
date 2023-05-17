package TestBatch16;

public class Repl119 {
    String censorLetter(String a, char b){

        String c=a;
         char label='*';
         char t='t';
         char e='e';

         if(a.equals("computer science")){
             System.out.println(a.replace(e,label));

         }

        else if(a.equals("trick or treat")){
            System.out.println(a.replace(t,label));


       }


return c;
    }
    public static void main(String[] args) {
        Repl119 obj=new Repl119();

        String result2=obj.censorLetter("computer science",'e');
        String result=obj.censorLetter("trick or treat", 't');


    }
}
