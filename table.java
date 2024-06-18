import java.util.Scanner;

public class table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which table you want to print");
        int t = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(t + "x" + i + "=" + i * t);
        }

    }
}
