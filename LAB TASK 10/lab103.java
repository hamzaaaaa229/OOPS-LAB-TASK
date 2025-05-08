import java.util.Scanner;

class Division {
    int Num1;
    int Num2;

    public int getNum1() {
        return Num1;
    }

    public void setNum1(int num1) {
        this.Num1 = num1;
    }

    public int getNum2() {
        return Num2;
    }

    public void setNum2(int num2) {
        this.Num2 = num2;
    }
}

public class lab103 {
    public static void main(String[] args) {
        Division obj = new Division();
        Scanner scanner = new Scanner(System.in);
        obj.setNum1(10);

        System.out.println("Num2 in backward from 9:");

        while (true) {
            System.out.print("Enter Num2: ");
            int num2 = scanner.nextInt();
            obj.setNum2(num2);

            if (num2 > 9) {
                System.out.println("Number must be 9 or less. Try again.");
                continue;
            }

            if (num2 < 0) {
                System.out.println("Negative numbers not allowed. Try again.");
                continue;
            }

            if (num2 == 0) {
                System.out.println("Cannot divide by zero. Program stopped.");
                break;
            }

            int result = obj.getNum1() / obj.getNum2();
            System.out.println(obj.getNum1() + " / " + obj.getNum2() + " = " + result);

            if (num2 == 1) {
                System.out.println("Reached 1. Program completed.");
                break;
            }
        }

        scanner.close();
    }
}