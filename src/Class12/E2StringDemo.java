package Class12;

public class E2StringDemo {
    public static void main(String[] args) {

        String name="Ayaulym";
        String lastName="Sailaubekova";
        String password="123qwe";


        if(name.length()<10){
            System.out.println(name);
        } else{
            System.out.println("Only 10 symbols allowed on this box");
        }
        if(lastName.length()<15){
            System.out.println(lastName);
        }else{
            System.out.println("Only 15 symbols allowed in this box");
        }
        if(password.length()<8){
            System.out.println("Signup successful");
        } else{
            System.out.println("Password cant be more than 8 characters");
        }
    }
}
