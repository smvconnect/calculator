import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int result = 0;
        char operation;
        result = calculate(inputNumber(), inputOperation(), inputNumber());
        System.out.println("Result = " + result);
        do {
            operation = inputOperation();
            if (operation == 'C') {
                result = 0;
                result = calculate(inputNumber(), inputOperation(), inputNumber());
                System.out.println("Result = " + result);
            } else if (operation == 's') {
                System.out.println("Exit");
                break;
            } else {
                result = calculate(result, operation, inputNumber());
                System.out.println("Result = " + result);
            }
        } while (true);
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int operand = scanner.nextInt();
        return operand;
    }

    public static char inputOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation:");
        char operation;
        do {
            operation = scanner.next().charAt(0);
            if (operation == '+' 
                    || operation == '-' 
                    || operation == '*' 
                    || operation == '/' 
                    || operation == 'C' 
                    || operation == 's') { 
                break;
            }
            System.out.println("Incorrect operation.\nPlease, try enter the operation again:");
        } while (true);
        return operation;
    }

    private static int calculate(int operand1, char operation, int operand2) {
        int result = 0;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
        }
        return result;
    }
}
