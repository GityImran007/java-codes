class FactorialException {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);

            if (n < 0) {
                throw new IllegalArgumentException("Negative number not allowed");
            }

            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + n + " = " + fact);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide a number as command line argument");
        }

        catch (NumberFormatException e) {
            System.out.println("Only integer values are allowed");
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}