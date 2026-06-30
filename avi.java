
public class Avi {

    public static void main(String[] args) {
        String s = "Ava";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}
