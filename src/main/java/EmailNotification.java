public class EmailNotification extends Notification {

    private final String emailAddress;

    public EmailNotification(String message, String emailAddress) {
        super(message);
        this.emailAddress = emailAddress;
    }

    @Override
    public String send() {
        return "Sending Email to \"" + emailAddress + "\": \"" + message + "\"";
    }
}
