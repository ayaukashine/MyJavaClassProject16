package Project1;

public class Task9Project {
    public static void main(String[] args) {

         int [] numbers={635,94,56,31,29,28,54,60,999,25,8,1059};


         int largest=numbers[0];
        for (int number : numbers) {
            for (int i : numbers) {
                if(largest<i){
               largest=i;
                }

            }
        }
        System.out.println(largest);

    }
}
