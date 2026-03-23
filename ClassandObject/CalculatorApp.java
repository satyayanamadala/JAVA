import java.util.Scanner;

// Calculator class with basic operations
class Calculator {
    int add(int a, int b) { return a + b; }
    int subtract(int a, int b) { return a - b; }
    int multiply(int a, int b) { return a * b; }
    int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b; // integer division
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.println("==== Simple Calculator ====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice;
            if (!sc.hasNextInt()) {
                System.out.println("Enter a number from the menu.");
                sc.nextLine();
                continue;
            }
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option.");
                continue;
            }

            System.out.print("Enter first number: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter an integer.");
                sc.next();
            }
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter an integer.");
                sc.next();
            }
            int b = sc.nextInt();

            try {
                int result = 0;
                switch (choice) {
                    case 1: result = calc.add(a, b); break;
                    case 2: result = calc.subtract(a, b); break;
                    case 3: result = calc.multiply(a, b); break;
                    case 4: result = calc.divide(a, b); break;
                }
                System.out.println("Result: " + result);
            } catch (ArithmeticException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            System.out.println();
        }

        sc.close();
    }
}