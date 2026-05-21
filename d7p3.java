import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class d7p3 { //MergeLists

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {

        List<T> merged = new ArrayList<>();

        int size = Math.max(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {

            if (i < list1.size()) {
                merged.add(list1.get(i));
            }

            if (i < list2.size()) {
                merged.add(list2.get(i));
            }
        }

        return merged;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.println("Enter size of first list:");
        int n1 = sc.nextInt();

        System.out.println("Enter elements of first list:");

        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }

        System.out.println("Enter size of second list:");
        int n2 = sc.nextInt();

        System.out.println("Enter elements of second list:");

        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }

        List<Integer> result = mergeLists(list1, list2);

        System.out.println("Merged List:");
        System.out.println(result);

        sc.close();
    }
}