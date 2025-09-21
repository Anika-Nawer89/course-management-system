public class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("--- Sending SMS ---");
        System.out.println("Body: " + body);
    }
}