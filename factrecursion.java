public class factrecursion {
    static int fact = 1; // static means global variable

    void callFact(int n) {
        if (n > 1) {
            fact = fact * n;
            callFact(n - 1);
        }
    }

    // int callFact(int n) {
    // if (n > 1) {
    // fact = fact * n;
    // callFact(n - 1);
    // }
    // return fact;
    // }

    public static void main(String[] args) {
        int n = 5;
        factrecursion f = new factrecursion(); // object creation
        f.callFact(n);
        System.out.println(fact);
    }

}
