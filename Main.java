public class Main {
    public static void main(String[] args) {
        System.out.println("--- Bridge Pattern Demo ---");

        // We can create any combination of Abstraction and Implementation.

        // 1. Create a System Message and link it to the Push Notification implementation.
        Message systemPush = new SystemMessage(new PushNotificationSender());
        systemPush.send();

        System.out.println("\n---------------------------\n");

        // 2. Create a Text Message and link it to the SMS implementation.
        Message textSMS = new TextMessage(new SMSSender());
        textSMS.send();
    }
}
