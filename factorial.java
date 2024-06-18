public class factorial {
    public static void main(String args[]) {
        int n = 3;
        int t = 1;

        for (int i = n; i >= 1; i--) {
            t = i * t;
        }
        System.out.println("Factorial is: " + t);

    }

}
