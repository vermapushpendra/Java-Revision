class findGreator {

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 20;

        if (a > b && a > c) {
            System.out.println("a is greator");
        } else if (b > a && b > c) {
            System.out.println("b is gretor");
        } else if (a == b ) {
            System.out.println("a and b is equal");
        } else if (a == c) {
            System.out.println("a and c is equal");
        } else if (b == c) {
            System.out.println("b and c is equal");
        } else
            System.out.println("c is gretor");
    }
}