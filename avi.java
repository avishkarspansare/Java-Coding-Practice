
public class Avi {

    public static void main(String[] args) {
        int  n = 101;
        int temp = n, rev= 0;

        for(int i = 0; i<n; i++) {
            n = n/10 + n%10;
            temp = n/10;
        }
        System.out.println(temp);
    }
}
