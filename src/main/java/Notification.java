public class Notification {

    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    public String send() {
        return message;
    }

}
