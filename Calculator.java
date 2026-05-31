import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double a = readDouble(scanner);
        System.out.print("Enter operator (+, -, *, /): ");
        char op = readOperator(scanner);
        System.out.print("Enter second number: ");
        double b = readDouble(scanner);

        try {
            double result = calculate(a, b, op);
            System.out.printf("Result: %.6f\n", result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double readDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Enter a number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static char readOperator(Scanner scanner) {
        String input = scanner.next();
        if (input.length() != 1) {
            return readOperator(scanner);
        }
        char op = input.charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            return op;
        }
        System.out.print("Invalid operator. Enter one of +, -, *, /: ");
        return readOperator(scanner);
    }

    private static double calculate(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + op);
        }
    }
}
