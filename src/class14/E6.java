package class14;

public class E6 {
    boolean isEven(int a){
        boolean numb= false;
      if (a%2==0){
          numb= true;
      }return numb;
    }

    public static void main(String[] args) {
        E6 obj=new E6();
        int a= 21;
        boolean result=obj.isEven(a);
        System.out.println(result);
  //
    }


}
