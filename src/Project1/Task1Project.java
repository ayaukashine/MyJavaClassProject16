package Project1;

public class Task1Project {
    public static void main(String[] args) {


        int [] weekTemp={60,55,63,78,75,45,43};

           int largest=weekTemp[0];
        for (int temp : weekTemp) {
            if (temp > largest) {
                largest = temp;
            }
        }
int smallest=weekTemp[0];
            for (int temp2 : weekTemp) {
                if(temp2<smallest){
                    smallest=temp2;
                }

            }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
