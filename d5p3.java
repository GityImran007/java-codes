class NonAlphabetException extends Exception {
    NonAlphabetException(String message) {
        super(message);
    }
}

class CharacterCounter {
    int count = 0;

    void addCharacter(char ch) throws NonAlphabetException {
        if (!Character.isLetter(ch)) {
            throw new NonAlphabetException("Non alphabetic character detected");
        }

        count++;
        System.out.println("Character Accepted: " + ch);
    }

    void displayCount() {
        System.out.println("Total Alphabetic Characters = " + count);
    }
}

public class d5p3 { //TestCounter
    public static void main(String[] args) {
        CharacterCounter c = new CharacterCounter();

        try {
            c.addCharacter('A');
            c.addCharacter('b');
            c.addCharacter('9');
        }

        catch (NonAlphabetException e) {
            System.out.println(e.getMessage());
        }

        c.displayCount();
    }
}