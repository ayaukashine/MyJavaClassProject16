package Homeworks;

public class AX  extends CreditCard{
@Override
    void method1(int balance, double interest){

    double sum=balance*interest;
            System.out.println("Interest is "+ sum);

    }
   public static void main(String[] args) {

    AX ax=new AX();
    ax.method1(500,0.002);
  ax.method1(500,0.02);

    }
}
