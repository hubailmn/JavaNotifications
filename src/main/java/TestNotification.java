public class TestNotification {

    public static void main(String[] args) {
        Notification notification = new Notification("Hello");
        Notification emailNotification = new EmailNotification("How Are you!", "Email@uqu.edu.sa");
        Notification secureEmailNotification = new SecureEmailNotification("This is a secured Message", "OtherEmail@uqu.edu.sa", true);
        Notification unSecureEmailNotification = new SecureEmailNotification("This is a unsecured Message", "AnotherEmail@uqu.edu.sa", false);

        System.out.println(notification.send());
        System.out.println(emailNotification.send());
        System.out.println(secureEmailNotification.send());
        System.out.println(unSecureEmailNotification.send());

    }
}
