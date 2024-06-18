import java.util.Scanner;

public class userInput {
    public static void main(String args[]) {
        String res;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = sc.next(); // whole line

            System.out.print("Enter birth place: ");
            String place = sc.next();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.println(name);
            System.out.println(place);
            System.out.println(age);

            System.out.println("Do you want to run again this code? if yes then write y and n for not !");
            res = sc.next();
        } while (res.equals("y") || res.equals("Y"));

    }
}
