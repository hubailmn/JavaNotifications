public class SecureEmailNotification extends EmailNotification {

    private final boolean encrypted;

    public SecureEmailNotification(String message, String emailAddress, boolean encrypted) {
        super(message, emailAddress);
        this.encrypted = encrypted;
    }


    @Override
    public String send() {
        return (encrypted ? "Secured Message! |" : "Unsecured Message! |") + " " + super.send();
    }

}
