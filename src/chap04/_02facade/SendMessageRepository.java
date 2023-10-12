package chap04._02facade;


// 발송된 메세지 내역을 DB에 적재하는 레포지토리 클래스
public class SendMessageRepository {
    public void save(){
        System.out.println("발송된 모든 메세지 내역은 DB에 저장됐습니다.");
    }
}
