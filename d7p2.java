import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class d7p2 { //PrintMap

    public static <K, V> void printMap(Map<K, V> map) {

        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        System.out.println("Enter number of entries:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter key:");
            int key = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter value:");
            String value = sc.nextLine();

            map.put(key, value);
        }

        System.out.println("Map Elements:");

        printMap(map);

        sc.close();
    }
}