package cc.hubailmn.advancedproggraming.Lab1.task2;

public class AnonymousClassTest {

    public static void main(String[] args) {

        MessageFormatter messageFormatter = new MessageFormatter() {
            @Override
            public String format(String message) {
                return message.toUpperCase();
            }
        };

        System.out.println(messageFormatter.format("Hello Mohammad!"));

    }
}
