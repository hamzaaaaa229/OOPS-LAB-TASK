import java.util.Scanner;

public class employeesdata {
    public static void main(String[] args) {
        System.out.println("Enter Employees Details: ");
        Scanner data = new Scanner(System.in);
        StringBuffer employeesdata = new StringBuffer();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Employees " +i+ " Name: ");
            String name = data.nextLine();
            System.out.print("Enter Employees " +i+ " Email: ");
            String email = data.nextLine();
            employeesdata.append(name).append(": ").append(email).append("\n");
        }
        System.out.println("Employee Details:");
        System.out.println(employeesdata);
    }
}