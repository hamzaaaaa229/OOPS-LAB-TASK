public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
    public double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero!");
            return 0.0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int intResult1 = calculator.add(5, 3);
        int intResult2 = calculator.subtract(5, 3);
        int intResult3 = calculator.multiply(5, 3);
        int intResult4 = calculator.divide(6, 2);

        System.out.println("Integer results:");
        System.out.println("Add: " + intResult1);
        System.out.println("Subtract: " + intResult2);
        System.out.println("Multiply: " + intResult3);
        System.out.println("Divide: " + intResult4);

        double doubleResult1 = calculator.add(5.5, 2.5);
        double doubleResult2 = calculator.subtract(5.5, 2.5);
        double doubleResult3 = calculator.multiply(5.5, 2.5);
        double doubleResult4 = calculator.divide(5.0, 2.0);

        System.out.println("\nDouble results:");
        System.out.println("Add: " + doubleResult1);
        System.out.println("Subtract: " + doubleResult2);
        System.out.println("Multiply: " + doubleResult3);
        System.out.println("Divide: " + doubleResult4);

        calculator.divide(5, 0);
        calculator.divide(5.0, 0.0);
    }
}
