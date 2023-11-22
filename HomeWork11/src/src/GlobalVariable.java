import java.util.ArrayList;
import java.util.List;

public class GlobalVariable {

    private static String yourName = "your name";

    private static List<String> groupNames = new ArrayList<>();

    public static void main(String[] args) {
        groupNames.add("A");
        groupNames.add("B");
        groupNames.add("C");

        for (String groupName : groupNames) {
            if (groupName.equals(yourName)) {
                System.out.println("Your name is: " + yourName);
            }
        }

    }
}
