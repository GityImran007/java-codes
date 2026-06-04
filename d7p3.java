import java.util.*;

public class ListMerger {

    // Generic method: alternates elements from list1 and list2
    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            merged.add(list1.get(i++));
            merged.add(list2.get(j++));
        }
        while (i < list1.size()) merged.add(list1.get(i++));
        while (j < list2.size()) merged.add(list2.get(j++));
        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of List 1: ");
        int n1 = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter elements of List 1:");
        for (int i = 0; i < n1; i++) list1.add(sc.nextInt());

        System.out.print("Enter size of List 2: ");
        int n2 = sc.nextInt();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Enter elements of List 2:");
        for (int i = 0; i < n2; i++) list2.add(sc.nextInt());

        List<Integer> merged = mergeLists(list1, list2);

        System.out.println("\nList 1 : " + list1);
        System.out.println("List 2 : " + list2);
        System.out.println("Merged  : " + merged);

        sc.close();
    }
}
