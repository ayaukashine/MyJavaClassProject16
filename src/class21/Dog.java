package class21;

class Animal{
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void speak(){
        System.out.println("Animals Speak");
    }
    void sleep(){
        System.out.println("Animals sleep 1 to 20 hours a day");
    }
    void eat(){
        System.out.println("Animals eat many different things ");
    }
}

class Cat extends Animal{

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override

    void speak(){
        System.out.println("Meow meow.....");
    }
    @Override
    void eat(){
        System.out.println("Cats like to eat Fish");

    }
    @Override
    void sleep(){
        System.out.println("Cats like to sleep 12 hours");
    }
}
public class Dog extends Animal{


    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("woof woof");
    }
    @Override
    void sleep(){
        System.out.println("Dogs like to sleep 10 hours");
    }
    @Override
    void eat(){
        System.out.println("Dogs like to chew the bones");
    }
}
class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("shaggy", "black", "German");
        dog.printInfo();
        //Parent class variables can store the objects of the child classes
        Animal dog1 = new Dog("shaggy", "black", "German");
        dog1.printInfo();

        Animal[] animals = {new Dog("shaggy", "black", "German"), new Cat("Tom", "Blue", "persian")};

        for (Animal animal : animals) {
            animal.printInfo();
        }
    }


}
  class Horse extends Animal{

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void eat() {
        System.out.println("Horses likes to eat clean grass");
    }

    @Override
    void sleep() {
        System.out.println("Horses sleep 2-3 hours");
    }

    @Override
    void speak() {
        System.out.println("IYUGH IYUHGGG");
    }
}




