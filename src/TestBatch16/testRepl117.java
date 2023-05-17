package TestBatch16;

public class testRepl117 {
    int sumEvenTox(int a){
        int sum=0;
        for(int i=0; i<a; i++){

            if(i%2==0){

                sum=sum+i;
            }
        }return sum;
    }


    public static void main(String[] args) {
        testRepl117 obj= new testRepl117();
        int result=obj.sumEvenTox(5);
        System.out.println(result);
    }

}
