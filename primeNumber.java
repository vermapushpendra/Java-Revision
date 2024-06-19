public class primeNumber {
    public static void main(String[] args) {
        // Prime number Devided by 1 and by itSelf
        int n = 7;
        int temp = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println("Number is not a prime number");
        } else
            System.out.println("Number is a prime number");

    }
}
