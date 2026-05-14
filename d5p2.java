class NoMatchFoundException extends Exception {
    NoMatchFoundException(String message) {
        super(message);
    }
}

public class d5p2 { //StringCheck
    public static void main(String[] args) {
        String str = "College";

        try {
            if (!str.equals("University")) {
                throw new NoMatchFoundException("String does not match 'University'");
            }

            System.out.println("String matched successfully");
        }

        catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}