package class20;

public class AnimalTester {
    public static void main(String[] args) {
        Cat cat=new Cat("Blue","persian",5,10.2);
        Dog dog=new Dog("Asteroid", "Great Dane", 6);
       // Horse horse=new Horse("Kayne", "Appaloosa", 12);

        cat.sleep();
        cat.eat();
        cat.printInfo();


        dog.sleep();
        dog.eat();
        dog.printInfo();


    }

}
