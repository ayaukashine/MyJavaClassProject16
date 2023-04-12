package class8;

public class E11NestedLoops {
    public static void main(String[] args) {
        int counter=0;

        while(counter<=4){
            for (int i = 2; i <= 10; i=i+2) {
                System.out.print(i+" ");

            }
            System.out.println( );
            counter++;
        }
    }
}
