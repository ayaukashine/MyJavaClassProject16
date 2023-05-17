package class17;

public class Laptop {

    String make;
    String model;
    double batteryLife;
    int storage;

    boolean camera;
    boolean touchPad;
    boolean touchScreen;

    Laptop(String make,String model,double batteryLife, int storage,boolean camera, boolean touchPad,boolean touchScreen){

        this.make=make;
        this.model=model;
        this.batteryLife=batteryLife;
        this.camera=camera;
        this.touchPad=touchPad;
        this.touchScreen=touchScreen;

    }
void printInfo(){
    System.out.println(make+" "+model+" "+" "+batteryLife+" "+camera+" "+touchPad+" "+touchScreen);
}
    public static void main(String[] args) {
        Laptop dellG5=new Laptop("Dell","g5",3,512,true,true, false);
dellG5.printInfo();
    }
}
