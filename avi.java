import java.util.Scanner;

public class Avi {
    private String name;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Avi a = new Avi();
        a.setname(s);
        System.out.println(a.getname());
        sc.close();

    }
}
