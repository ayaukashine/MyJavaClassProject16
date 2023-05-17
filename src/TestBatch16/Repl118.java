package TestBatch16;

import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

public class Repl118 {
    String spaceOut(String a) {
        String space = "";
        String sp=" ";


        for (int i = 0; i < a.length(); i++) {

            space = space+a.charAt(i)+sp;



        }
        return space;
    }


    public static void main(String[] args) {


        Repl118 obj = new Repl118();
        String result = obj.spaceOut("hello");
        System.out.println(result);
    }
}