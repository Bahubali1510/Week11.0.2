import java.util.HashMap;
import java.util.Map;

public class HashMapPeople {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();

        people.put("abc", 1);
        people.put("pqr", 2);
        people.put("xyz", 3);

        for (Integer age : people.values()) {
            System.out.println("Age: " + age);

        }
    }
}