public class Outbox {
    private static final int DEFAULT_CAPACITY = 100;

    private final Message[] messages;
    private int count;

    public Outbox() {
        this.messages = new Message[DEFAULT_CAPACITY];
        this.count = 0;
    }

    public Outbox(int capacity) {
        this.messages = new Message[capacity];
        this.count = 0;
    }

    public void enqueue(Message message) {
        if (count >= messages.length) {
            throw new IllegalStateException("Outbox is full");
        }

        messages[count] = message;
        count++;
    }

    public void enqueue(Message message, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            enqueue(message);
        }
    }

    public String flush() {
        String log = "";

        for (int i = 0; i < count; i++) {
            log += messages[i].deliver();

            if (i < count - 1) {
                log += "\n";
            }
        }

        count = 0;
        return log;
    }

    public double totalCost() {
        double total = 0.0;

        for (int i = 0; i < count; i++) {
            total += messages[i].cost();
        }

        return total;
    }

    public int size() {
        return count;
    }
}