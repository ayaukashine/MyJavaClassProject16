package class18;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

            Dog(String name, String breed, String color, int age, double weight) {
       /* this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;*/
                this(name, breed, color, age);
        this.weight = weight;
    }

         Dog(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;


    }
}