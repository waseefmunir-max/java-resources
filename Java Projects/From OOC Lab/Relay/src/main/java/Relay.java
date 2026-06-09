/**
 * Relay — the outbound message hub in action.
 *
 * This entry point wires the pieces together the way a real caller would: it
 * builds a handful of notices across every channel, audits them, then drops
 * them into a single {@link Outbox} and asks the outbox to price and send the
 * whole batch. Notice that nothing below ever asks a message "what channel are
 * you?" — every item is held as a {@link Message} and decides for itself how to
 * describe, cost, and deliver. That is the entire point of the design.
 */
public class Relay {

    public static void main(String[] args) {
        // Recipients are things a notice HAS — plain collaborators, not channels.
        Recipient ada   = new Recipient("Ada Lovelace", "ada@analytical.engine");
        Recipient alan  = new Recipient("Alan Turing",  "alan@bletchley.park");
        Recipient grace = new Recipient("Grace Hopper", "grace@navy.mil");

        Message email = new EmailMessage(
                ada,
                "Your order has been confirmed."
        );

        Message sms = new SmsMessage(
                alan,
                "Your one-time code is 123456."
        );

        Message push = new PushMessage(
                grace,
                "Delivery alert: your parcel is arriving soon. Please keep your phone nearby."
        );

        Message priorityEmail = new PriorityEmailMessage(
                ada,
                "Security alert: a new sign-in was detected."
        );

        Message[] batch = {email, sms, push, priorityEmail};

        System.out.println("Audit log:");
        for (Message message : batch) {
            System.out.println(message.describe());
        }

        Outbox outbox = new Outbox();

        for (Message message : batch) {
            outbox.enqueue(message);
        }

        System.out.println();
        System.out.println("Messages waiting: " + outbox.size());
        System.out.println("Total cost: " + outbox.totalCost());

        System.out.println();
        System.out.println("Transmission log:");
        System.out.println(outbox.flush());

        System.out.println();
        System.out.println("Messages waiting after flush: " + outbox.size());
    }
}