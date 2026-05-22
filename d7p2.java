import java.util.*;

public class MapPrinter {

    // Generic method: prints each key-value pair of any Map
    public static <K, V> void printMap(Map<K, V> map) {
        System.out.println("{");
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey()
                + " -> " + entry.getValue());
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();

        System.out.print("How many key-value pairs? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name (key): ");
            String key = sc.nextLine();
            System.out.print("Enter marks (value): ");
            int value = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            map.put(key, value);
        }

        System.out.println("\nMap contents:");
        printMap(map);

        sc.close();
    }
}
