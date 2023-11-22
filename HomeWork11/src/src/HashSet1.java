import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<Integer>();

        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);

        System.out.println("Add number between 1 to 10");
        for (int i = 1; i<=10; i++){
            if (numberSet.contains(i)){
                System.out.println(i +" is in the set");
            }else {
                System.out.println(i + " is not in the set");
            }
        }


    }

}
