package chap01._05exception.checkedException;

public class CheckedExceptionExampleMain {
    public static void main(String[] args) {
        Client client = new Client();

        // 해당 메서드가 throws로 본인을 호출하는 지역에서 예외처리를 하라고 떠넘긴 상태이므로
        // 현재 호출하고 있는 main method에서 try-catch를 작성해야함.
        try{
            client.throwsCheckedExcpetionethod();
        } catch (CheckedException e){
            // 예외 전환
                // CheckedException은 어떤 오류가 나타났는지 외부에서 짐작이 가능한데
                // RuntimeException으로 바꿔서 발생시켜서
                // 이를 숨겨 캡슐화를 보장해줌
            throw new RuntimeException();
        }

        // 이미 try-catch 처리가 된 메서드의 경우는 호출지역에서 따로 처리하지 않아도 됨
        client.tryCatchCheckedExceptionMethod();
    }
}
