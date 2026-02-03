package cc.hubailmn.advancedproggraming.Lab1.task1;

public class EmailNotification extends Notification {

    private String emailAddress;

    public EmailNotification(String message, String emailAddress) {
        super(message);
        this.emailAddress = emailAddress;
    }

    @Override
    public String send() {
        return "Sending Email to \"" + emailAddress + "\": \"" + message + "\"";
    }
}
