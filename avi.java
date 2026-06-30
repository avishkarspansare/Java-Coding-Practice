
public class Avi {

    public static void main(String[] args) {
        // String s = "avai";
        // String rev = new StringBuilder(s).reverse().toString();
        // System.out.println((s.equals(rev)) ? "palindrome" : "not palindrome");

        int n = 121;
        int temp = n, rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println((temp == rev) ? "Palindrome number" : "Not a Palindrome Number");
        System.out.println(rev);

    }
}
