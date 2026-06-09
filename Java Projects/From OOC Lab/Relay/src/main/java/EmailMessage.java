public class EmailMessage extends Message {

    public EmailMessage(Recipient recipient, String text) {
        super(recipient, text);
    }

    @Override
    public String deliver() {
        return "EMAIL to " + getRecipient().getName()
                + " <" + getRecipient().getAddress() + ">: "
                + getText();
    }

    @Override
    public double cost() {
        return 0.0;
    }

    @Override
    public String describe() {
        return "EMAIL message for " + getRecipient().getName();
    }
}