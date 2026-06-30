
public class Avi {

    public static void main(String[] args) {
        String s = "ava";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println((s.equals(rev)) ? "palindrome" : "not palindrome");
    }
}
