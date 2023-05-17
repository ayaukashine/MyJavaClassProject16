package class22;

public class AnimalTester2 {

    public static void main(String[] args) {

        Animal ani[]={new Dog("Jaccky","black", "Great Dane"),
                new Cat("Blue","grey mix", "unknown",6),
                new Horse("Appak", "White","Arabian") };
       for(Animal animals:ani){
           animals.sleep();
           animals.eat();
           animals.speak();

       }
    }
}
