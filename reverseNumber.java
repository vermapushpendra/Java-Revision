public class reverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int rev = 0;
        int rem;

        // String number = String.valueOf(n);
        // int len = number.length();

        // for (int i = len; i >= 1; i--) {
        // rem = n % 10;
        // rev = (rev * 10) + rem;
        // n = n / 10; //int so it will take only int not float
        // }

        while (n != 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        System.out.println("Revered number: " + rev);
    }
}
