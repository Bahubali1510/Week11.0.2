import java.util.ArrayList;

public class TubeArray {
    public static boolean main(String[] args) {
        ArrayList<String> tubeNames = new ArrayList<>();

        tubeNames.add("Jubliee");
        tubeNames.add("Metropolitan");
        tubeNames.add("piccadilly");


        if (tubeNames.isEmpty()) {
            System.out.println("Tube name list is empty");
        } else {
            System.out.println("Tube name list is not empty");
        }

        // private static boolean m1 (ArrayList<?> tubeNames) {
        //     return tubeNames == null || tubeNames.isEmpty();

        return false;
    }
}