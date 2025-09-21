public class PushNotificationSender implements MessageSender {
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("--- Sending Push Notification ---");
        System.out.println("Title: " + subject);
        System.out.println("Message: " + body);
    }
}