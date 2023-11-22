import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StationLines {
    public static void main(String[] args) {
        Map<String, String> stationLines = new HashMap<>();

        stationLines.put("station1" , "BakerStreet");
        stationLines.put("station2" , "piccadilly");
        stationLines.put("station3" , "waterloo");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter station name");
        String stationName = sc.nextLine();

        if (stationLines.containsKey(stationName)) {

            System.out.println("The station " + stationName + " is in Zone 1 " );
        } else {
            System.out.println("The station " + stationName + " is not in Zone 1 ");
        }

    }
}
