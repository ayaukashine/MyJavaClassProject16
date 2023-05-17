package Homeworks;

public class CreditCard {



 void method1(int balance, double interest){

        double sum=balance+interest;
        System.out.println("Interest is "+ sum);
    }

    public static void main(String[] args) {
        CreditCard cc=new CreditCard();
        cc.method1(500,0.002);
    }
}
