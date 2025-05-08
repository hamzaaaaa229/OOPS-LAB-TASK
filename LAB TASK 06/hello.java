import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println("Enter new Word to add: ");
        Scanner b = new Scanner(System.in);
        String input = b.nextLine();
        StringBuffer a = new StringBuffer(input);
        System.out.println("Hello, " + a);
    }
}
