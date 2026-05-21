import java.util.Scanner;

public class d7p1 { //CompareArrays

    public static <T> boolean checkArrays(T[] arr1, T[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] arr1 = new Integer[5];
        Integer[] arr2 = new Integer[5];

        System.out.println("Enter elements of first array:");

        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");

        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean result = checkArrays(arr1, arr2);

        if (result) {
            System.out.println("Arrays are same.");
        } else {
            System.out.println("Arrays are different.");
        }

        sc.close();
    }
}