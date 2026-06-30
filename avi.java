
public class Avi {

    public static void main(String[] args) {
        int n = 5;
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                isPrime = false;
            }
        }
        System.out.println((isPrime == true) ? "Prime Number" : "Not a Prime Number");

    }
}
