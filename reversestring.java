
import java.util.*;

public class reversestring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        String rev = "";
        //method 1 - O(n^2)
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
            System.out.println(rev);
        }
        System.out.println(rev);

        // //method2 - O(n)
        // String rev2 = new StringBuilder(s).reverse().toString();
        // System.out.println(rev2);
    }

}
