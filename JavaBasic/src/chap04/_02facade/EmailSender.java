package chap04._02facade;

public class EmailSender implements MessageSender{
    @Override
    public void send() {
        System.out.println("이메일을 발송합니다.");
    }
}
