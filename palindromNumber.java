import java.util.Scanner;

public class palindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n; //to keep n is safe and accurate
        int rem = 0;
        int rev = 0;

        while (n != 0) {
            rem = n % 10;
            rev = 10 * rev + rem;
            n = n / 10;
        }

        if (rev == temp) {
            System.out.println("Number is Palindrome number");
        } else
            System.out.println("Number is Not a Palindrome number");

    }
}
