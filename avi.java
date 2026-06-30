
public class Avi {

    public static void main(String[] args) {
        int n = 1901;
        int temp = n, rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println((temp == rev) ? temp : rev);
    }
}
