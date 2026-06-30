
public class Avi {
    private String name;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }
    public static void main(String[] args) {
        Avi a = new Avi();
        a.setname("Avishkar");
        System.out.println(a.getname());

    }
}
