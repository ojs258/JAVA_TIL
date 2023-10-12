package chap04._02facade;


// 알림 메세지를 발송하는 모든 매체는 이 클래스를 구현해야 합니다.
public interface MessageSender {
    void send();
}
