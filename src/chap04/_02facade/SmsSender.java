package chap04._02facade;

public class SmsSender implements MessageSender{
    @Override
    public void send() {
        System.out.println("문자 발송 완료");
    }
}
