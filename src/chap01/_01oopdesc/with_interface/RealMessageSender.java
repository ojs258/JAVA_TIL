package chap01._01oopdesc.with_interface;

public class RealMessageSender implements MessageSender {
    public void send() {
        System.out.println("RealMessageSender, 실제 고객에게 문자가 넘어갑니다.");
    }
}
