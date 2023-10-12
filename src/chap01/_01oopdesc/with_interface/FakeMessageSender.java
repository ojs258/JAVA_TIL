package chap01._01oopdesc.with_interface;

    public class FakeMessageSender implements MessageSender {
    @Override
    public void send(){
        System.out.println("FakeMessageSender, 실제로는 넘어가지 않는 메세지입니다.");
    }
}
