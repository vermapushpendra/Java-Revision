public class swapTwoNumbers {
    public static void main(String args[]) {
        // With using third variable
        int a = 20;
        int b = 30;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a + b;
        b = a - b;

        a = a - b; // b has a swapped value of a ie. 20
        System.out.println("after swaped a: " + a);
        System.out.println("after swaped b: " + b);

        // With-out using third variable
        int x = 20;
        int y = 24;
        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
