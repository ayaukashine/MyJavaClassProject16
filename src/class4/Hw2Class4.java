package class4;

public class Hw2Class4 {
    public static void main(String[] args) {
        int loan=100000;
        if(loan>=150000){
            System.out.println("Congrats! We will lend you money");
        } else if(loan<=50000){
            System.out.println("Sorry, we are rejecting your request");
        }else{
            System.out.println("We might consider this option in the future");
        }
    }
}
