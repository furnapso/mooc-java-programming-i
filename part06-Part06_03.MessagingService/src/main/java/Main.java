
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService ms = new MessagingService();
        System.out.println(ms.getMessages());
        ms.add(new Message("sender", "message"));
        System.out.println(ms.getMessages());
    }
}
