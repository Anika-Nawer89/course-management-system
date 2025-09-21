public class SystemMessage extends Message {
    public SystemMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        // High-level logic for a system message
        String subject = "System Alert!";
        String body = "Your account will expire in 3 days.";
        messageSender.sendMessage(subject, body);
    }
}
