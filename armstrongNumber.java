public class armstrongNumber {
    public static void main(String[] args) {
        int n = 370;
        int num = n;
        String s = String.valueOf(n);
        int power1 = s.length();
        int power2 = s.length();
        int arm = 0;
        int rem = 0;

        while (power1 != 0) {
            int temp = 1;
            rem = n % 10;
            int base = rem;
            
            for (int i = 1; i <= power2; i++) {
                temp = base * temp;
            }
            arm = arm + temp;

            n = n / 10;
            power1--;
        }
        System.out.println(arm);

        if (arm == num) {
            System.out.println("Number is a Armstrong Number");
        } else
            System.out.println("Number is not a Armstrong Number");

    }
}
