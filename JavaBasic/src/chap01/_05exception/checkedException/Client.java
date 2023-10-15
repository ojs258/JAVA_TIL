package chap01._05exception.checkedException;

public class Client {
    // 예외를 발생시키려면 반드시 try-catch 구문을 써야하거나
    public void tryCatchCheckedExceptionMethod(){
        // checked exception의 경우, 발생 구문이 호출되면 무조건 예외처리가 동반되어야 합니다.
        try{
            throw new CheckedException();
            // 코드 작성단계에서 확인된 예외이기 때문에 Exception 핸들링을 해주어야함.
        } catch (CheckedException e){
            // 예외 처리 코드
            e.printStackTrace();
        }
    }

    // try-catch를 호출부에서 직접 상요하고 싶지 않다면, 이 메섣르르 호출하는 지역에서 처리할 수 있도록
    // throws를 메서드 우측에 작성할 수 있습니다. 이러면 try-catch를 작성해야하지만 굳이 현재 클래스 내부에서
    // 작성할 필요는 없습니다.
    public void throwsCheckedExcpetionethod() throws CheckedException{
        throw new CheckedException();
    }
}
