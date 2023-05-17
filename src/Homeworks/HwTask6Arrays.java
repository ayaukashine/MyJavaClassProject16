package Homeworks;

public class HwTask6Arrays {
    public static void main(String[] args) {

        int [] numbers={12,5,19,63,68,96};

        int sum=0;
        for (int number : numbers) {
            sum=number+sum;

        }
        System.out.println(sum);
    }
}
