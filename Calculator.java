import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Simple Java Calculator");

        
        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();

        
        System.out.print("Digite o operador (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        
        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextDouble();

       
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                break;
        }

        scanner.close();
    }
}