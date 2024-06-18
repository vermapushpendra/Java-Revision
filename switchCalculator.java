import java.util.Scanner;

public class switchCalculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter symbol of operation like +, - , /, *");
        String symbol = sc.next();

        switch (symbol) {
            case "+":
                System.out.println("Addition is: " + (a + b));
                break;

            case "-":
                System.out.println("Subtraction is: " + (a - b));
                break;

            case "/":
                System.out.println("Dividation is: " + (a / b));
                break;

            case "*":
                System.out.println("Multiplication is: " + (a * b));
                break;

            default:
                System.out.println("Entered Symbol is not appropriate please Enter the correct symbol");
        }
    }
}
