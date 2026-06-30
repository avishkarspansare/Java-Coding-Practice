// "An Armstrong number is a number whose sum of each digit raised to the power of the total number of digits is equal to the original number. For example, 153 = 1³ + 5³ + 3³."

import java.util.*;

public class amstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int temp = n, sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n /= 10;

        }
        System.out.println((sum == temp) ? (temp + " is an Amstrong number.") : (temp + " is not an Amstrong Number."));
    }
}
