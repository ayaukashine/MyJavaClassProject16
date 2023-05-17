package class9;

public class E8Arrays {
    public static void main(String[] args) {
        int [] numbers={0,1,2,3,4,5,6};
        for(int i= numbers.length-1; 0<=i; i--){
            System.out.print(numbers[i]+ " ");
        }
        String [] letters={"A","B","C","D","E","F"};
        System.out.println();
        for(int k=5; k>=0; k--){
            System.out.println(k+ " "+letters[k]);
        }
    }
}
