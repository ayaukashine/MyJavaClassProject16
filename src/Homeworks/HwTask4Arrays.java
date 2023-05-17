package Homeworks;

public class HwTask4Arrays {
    public static void main(String[] args) {
        String [] cars={"BMW","Ferrari","Porsche","Honda","Nissan","Toyota"};


        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");

        }
        System.out.println();

        for (String car : cars) {
            System.out.print(car+ " ");
        }
        System.out.println();
        int i=0;
        while(i<cars.length){
            System.out.print(cars[i]+ " ");
            i++;
        }

    }
}
