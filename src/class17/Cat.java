package class17;

public class Cat {


    String name;
    Cat(String catName){
       name=catName;
        System.out.println("1 argument constructor called");
    }
    Cat(String catName, String catColor){
        System.out.println("4th argument constructor called");
    }
   Cat(int age){

    System.out.println("the second constructor called");}

    Cat(double weight){
        System.out.println("the 3rd constructor called");
    }

    public static void main(String[] args) {
        Cat cat1=new Cat("Blue");
        Cat cat2=new Cat(10.5);
        Cat cat3=new Cat(12);
        Cat cat4=new Cat("Blue", "Grey");


    }
}
