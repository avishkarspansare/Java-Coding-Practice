
// public class primeNumber {
//     public static void main(String[] args) {
//         int n = 21;
//         boolean isPrime = true;
//         if (n <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= Math.sqrt(n); i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         System.out.println(isPrime? "Number is Prime": "Number is not Prime");
//     }
// }
//-----------------
import java.util.*;

class primeNumber {

    public static void main(String[] args) {

        int n = 55;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);

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

        System.out.println(isPrime ? "Number is Prime" : "Number is not Prime");
    }
}
