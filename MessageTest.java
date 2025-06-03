package xyz;

interface Message {
    void say();
}

public class MessageTest {
    public static void main(String[] args) {
        Message helloMessage = () -> System.out.println("This is Lambda");
        helloMessage.say();
    }
}
