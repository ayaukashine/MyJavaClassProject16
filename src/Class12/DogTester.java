package Class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog= new Dog();
        actualDog.name="Jacky";
        actualDog.age=50;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=56.2;
        actualDog.isFat=true;

        actualDog.bark();

        Dog obj=new Dog();
        obj.name="Lucy";
        obj.age=12;
        obj.breed="Great Dane";
        obj.color="Gray";
        obj.weight=85.20;
        obj.isFat=false;


        obj.sleep();

    }
}
