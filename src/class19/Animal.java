package class19;

public class Animal {
    String color;
    String name;

    String breed;

    int weight;

    int age;

    public Animal(String color, String name, String breed, int weight, int age) {
        this.color = color;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.age = age;
    }

    void printInfo(){
    System.out.println(name+" "+color+" "+breed+" "+weight+" "+age);
}



}
