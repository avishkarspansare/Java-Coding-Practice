
import java.util.*;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String s = sc.next();

        // //method1 - O(n) - String check
        // String rev = new StringBuilder(s).reverse().toString();
        // if(s.equals(rev)) {
        //     System.out.println("Palindrome.");
        // } else {
        //     System.out.println("Not a Palindrome.");
        // }
        // sc.close();
        // --------------------------
        // // Number Check
        Integer n = sc.nextInt();   

        int temp = n, rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;

        }   
        System.out.println((temp == rev) ? "Palindrome" : "Not a Palindrome");

    }
}
