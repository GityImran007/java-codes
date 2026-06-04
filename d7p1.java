import java.util.Arrays;
import java.util.Scanner;

public class ArrayComparison {

    // Generic method: checks if two arrays have same elements in same order
    public static <T> boolean areArraysEqual(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];

        System.out.println("Enter elements of Array 1:");
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter elements of Array 2:");
        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();

        System.out.println("\nArray 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));
        System.out.println("Arrays are equal: " + areArraysEqual(arr1, arr2));

        sc.close();
    }
}
