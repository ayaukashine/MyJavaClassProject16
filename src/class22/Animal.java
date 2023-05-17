package class22;

public abstract class Animal {

    String name;
    String breed;
    String color;

    Animal(String name, String color,String breed){
        this.name=name;
        this.breed=breed;
        this.color=color;
    }
    abstract void speak();
    abstract void sleep();
    abstract void eat();

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }

}


class Dog extends Animal{
    Dog(String name,String breed, String color){
        super(name, breed, color);
    }

    void speak() {
        System.out.println("wooof wooof");
    }

    void sleep() {
        System.out.println("Dog sleeps 2-10 hours");
    }

    void eat() {
        System.out.println("Eat bone");

    }

}
class Cat extends Animal {
  int age;
    Cat(String name, String color, String breed, int age){
        super(name, color, breed);
        this.age=age;
    }

    void speak(){
        System.out.println("neigh neigh");
    }
    void sleep(){
        System.out.println("12 hours");
    }
    void eat(){
        System.out.println("fish");
}

}

class Horse extends Animal{

    Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak(){
        System.out.println("IYUGH IYUGH");
    }
    void sleep(){
        System.out.println("Sleeps 2-5 hours");
    }
    void eat(){
        System.out.println("grass");
}

}