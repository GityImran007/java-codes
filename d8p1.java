class Chat {
    private boolean firstTurn = true;

    public synchronized void firstSpeaker(String msg) {
        while (!firstTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(msg);
        firstTurn = false;
        notify();
    }

    public synchronized void secondSpeaker(String msg) {
        while (firstTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(msg);
        firstTurn = true;
        notify();
    }
}

class Thread1 extends Thread {
    Chat chat;
    String[] messages = {
        "Hi",
        "How are you?",
        "I am also doing fine!"
    };

    Thread1(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        for (String msg : messages) {
            chat.firstSpeaker(msg);
        }
    }
}

class Thread2 extends Thread {
    Chat chat;
    String[] messages = {
        "Hi!",
        "I am good. What about you?",
        "Great!"
    };

    Thread2(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        for (String msg : messages) {
            chat.secondSpeaker(msg);
        }
    }
}

public class d8p1 {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Thread1 t1 = new Thread1(chat);
        Thread2 t2 = new Thread2(chat);

        t1.start();
        t2.start();
    }
}