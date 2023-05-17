package class20;

public class Animal {

    String name;
    String breed;
    int age;

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }



    void printInfo(){
        System.out.println(name+" "+breed+" "+age);

    }
    void eat(){
        System.out.println("nuuum  nummm");
    }
    void sleep(){
        System.out.println("ZZZZzzzzzZZZZZ");
    }
}
