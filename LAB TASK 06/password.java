import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        System.out.print("Enter Your Password : ");
        Scanner a = new Scanner(System.in);
        String password = a.nextLine();
        if ( password.length() < 6 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*[0-9].*"))
        {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
            System.out.println("a) The password should be at least six character long.");
            System.out.println("b) The password should contain at least one uppercase and at least one lower case letter.");
            System.out.println("c) The password should have at least one digit.");
        }
    }
}