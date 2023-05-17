package Class12;

/*Store username, password and confirm password from a user and check following requirements:

Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
You do not have permission to send messages in this channel.*/

public class taskStringDemo {
    public static void main(String[] args) {

        String username ="Veranda";
        String password="Password";
        String confirmPassword="Password";

        if (username.isEmpty() && password.isEmpty()){
            System.out.println("Username and Password can not be empty");
        }
        if (password.length()<8){
            System.out.println("Password is to short");
        }if (password.contains(username)){
            System.out.println("Password can not contain username");
        }if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }    }
}
