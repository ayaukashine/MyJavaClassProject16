package class9;

public class E11Arrays {
    public static void main(String[] args) {
        int []numbers= new int[5];
        numbers[4]=10;
        numbers[0]=100;
        numbers[1]=50;
        numbers[2]=60;
        numbers[3]=70;

        for(int number: numbers){
            System.out.println(number);
        }

    }
}
