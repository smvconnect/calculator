import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int result;
        result = calculate(inputNumber(), inputCharacter(), inputNumber());
        System.out.println("F" + result);
        do {
            switch (inputCharacter()) {
                case 'C':
                    result = calculate(inputNumber(), inputCharacter(), inputNumber());
                    System.out.println("F" + result);
                    break;
                case 's':


            }
                result = calculate(result, inputCharacter(), inputNumber());
                System.out.println("R" + result);
        } while (true);
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int operand = scanner.nextInt();
        return operand;
    }

    public static char inputCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character:");
        char operation = scanner.next().charAt(0);
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
