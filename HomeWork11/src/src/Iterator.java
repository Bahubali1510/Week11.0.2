import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<String> iterator = new ArrayList<>();

        iterator.add("element 1");
        iterator.add("element 2");
        iterator.add("element 3");
        iterator.add("element 4");

        for (String element : iterator){
            System.out.println(element);
        }

    }
}
