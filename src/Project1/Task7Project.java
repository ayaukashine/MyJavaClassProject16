package Project1;

//   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
public class Task7Project {
    public static void main(String[] args) {


        int a=1;
        int b=1;
        System.out.print(a+ " " +b);
        int sum=0;
        for (int i = 0; i < 11; i++) {
            sum=a+b;
            System.out.print(" ");
            System.out.print(sum);
            a=b;
            b=sum;

        }




    }
}
