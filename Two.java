
import java.util.*;

public class Two {

    public static void main(String[] args) {

        // List<Integer> arr = new ArrayList<>();
        Map<String, Integer> marks = new HashMap<>();

        marks.put("rahul", 100);
        marks.put("simmy", 200);

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.print(entry.getKey() + " ----- ");
            System.out.println(entry.getValue());
            System.out.println("----- ");
        }
    }
}
