
public class avi {
public volatile int a = 0;
        
    public static void main(String[] args) {
        Thread t = new Thread();
        
        avi obj = new avi();
        int s = obj.a++;
        System.out.println(s);

    }
}
