package class17;

import Class12.Dog;

public class dogClass {
    String name;
    String color;
     String breed;

     int age;

     void printInfo(){
         System.out.println(name+" "+color+" "+breed+" "+age);
     }

     dogClass(String dogName, String dogColor, String dogBreed, int DogAge){

         name=dogName;
         color=dogColor;
         breed=dogBreed;
         age=DogAge;

     }
}
