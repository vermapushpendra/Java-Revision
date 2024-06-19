public class fibonacciRecursion {
    static int a = 0;
    static int b = 1;
    static int c = 0;

    void fibo(int i) {
        if (i >= 1) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            fibo(i-1);
        }
    }

    public static void main(String args[]) {
        System.out.print(a + " " + b);
        fibonacciRecursion obj = new fibonacciRecursion();
        obj.fibo(10);

    }
}
