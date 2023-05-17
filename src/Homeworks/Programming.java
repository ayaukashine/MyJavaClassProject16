package Homeworks;

/*Create 1 class in which create a methods that will calculate the area of Method name must be called calculateArea
Rectangle
Square

Use separate class to test your code*/

/*Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
then the message "I love programming languages" should be printed.
If some String is passed to it, then in place of "programming languages" the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.


*/
public class Programming {

    void print1(){
        System.out.println("I love programming languages");
    }
    void print2(String a){

        System.out.println("I love "+ a);
    }

    public static void main(String[] args) {
        Programming str=new Programming();
        str.print1();
        str.print2("Java ");
    }
}
