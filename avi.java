
public class Avi {

    public static void main(String[] args) {
        int n = 60;
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println((isPrime) ? "Prime Number" : "Not a Prime Number");

    }
}
