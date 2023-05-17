package class20;

public class Dog extends Animal{

    public Dog(String name, String breed, int age){
        super(name,breed,age);

    }
    @Override
    void sleep(){
    System.out.println("I like to sleep 10.3 hours");
}
}
