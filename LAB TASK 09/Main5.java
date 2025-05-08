import java.util.Scanner;

class Division {
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public double divide() {
        return (double) num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Division div = new Division();

        System.out.print("Enter starting Num1 (e.g. 10): ");
        int num1 = input.nextInt();

        System.out.print("Enter starting Num2 (e.g. 9): ");
        int num2 = input.nextInt();

        while (num2 >= 0) {
            div.setNum1(num1);
            div.setNum2(num2);

            try {
                double result = div.divide();
                System.out.println(num1 + " / " + num2 + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }

            num1--;
            num2--;
        }

        input.close();
    }
}
