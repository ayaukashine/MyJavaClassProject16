package class17;

public class Car {
    String make;
    String model;
    int engineCC;
    String color;

    Car(String make, String model,int engineCC, String color){

        this.make=make;
        this.model=model;
        this.engineCC=engineCC;
        this.color=color;
    }
  void printInfo(){
    System.out.println(make+" "+model+" "+engineCC+" "+color);
}



    public static void main(String[] args) {
        Car car1=new Car("BMW","x1",2019,"grey");
        car1.printInfo();

    }
}
