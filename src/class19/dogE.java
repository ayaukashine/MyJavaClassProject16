package class19;

public class dogE extends Animal  {
    double price;

    public dogE(String name, String color, String breed, int age, int weight, double price) {
        super(name, color, breed, age, weight);
        this.price = price;
    }
    void printInfo(){
        super.printInfo();
        System.out.println(price);
    }
}
