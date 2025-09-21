public abstract class Message {
    // This is the BRIDGE to the implementation hierarchy.
    protected MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    public void show(){
        System.out.println("Message");
    }
    public abstract void send();
}
