package chap04._02facade;

public class KakaoSender implements MessageSender{
    @Override
    public void send() {
        System.out.println("카카오톡 알림 메세지를 발송합니다!");
    }
}
