public class stringReverse {
    public static void main(String[] args) {
        String name = "ardnephsup";
        int len = name.length();

        char rev = 0;
        String revName = "";

        for (int i = len; i >= 1; i--) {
            rev = name.charAt(i - 1);
            revName = revName + rev;
        }
        System.out.println(revName);
    }
}
