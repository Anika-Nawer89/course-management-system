public class TextMessage extends Message {
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        // High-level logic for a text message
        String subject = ""; // SMS doesn't have a subject
        String body = "Hi there! This is a regular text message.";
        // Delegate the actual sending to the implementation object.
        messageSender.sendMessage(subject, body);
    }
}
