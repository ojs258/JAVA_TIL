package chap04._02facade;

public class SendMessageFacade {
    MessageSender[] senderList;
    SendMessageRepository sendMessageRepository;

    public SendMessageFacade() {
        this.senderList = new MessageSender[]{new KakaoSender(), new EmailSender(), new SmsSender()};
        this.sendMessageRepository = new SendMessageRepository();
    }
    public void sendSave(){
        for(MessageSender sender : senderList){
            sender.send();
        }
        sendMessageRepository.save();
    }
}
