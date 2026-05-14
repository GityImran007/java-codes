interface Maximum {
    int findMax(int a, int b);
}

public class d6p3 { //LambdaMax
    public static void main(String[] args) {

        Maximum max = (a, b) -> {
            if (a > b)
                return a;
            else
                return b;
        };

        int result = max.findMax(10, 25);

        System.out.println("Maximum Number = " + result);
    }
}