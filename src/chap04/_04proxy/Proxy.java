package chap04._04proxy;

public class Proxy implements SomeInterface{
    // 대리자 객체는 본체의 기능을 호출해주면서
    //      거기에 더해 본인의 실행 메서드를 추가해야함.
    private Service service;

    // 대리자 객체 생성시 본체타입 Service가 자동으로 주입되도록 생성자 설정
    //      == 대리자니까 본체를 가지고 있어야 함
    public Proxy(){
        this.service = new Service();
    }
    @Override
    public void someMethod() {
        // 본체 위임 메서드 실행 전
        System.out.println("Before()");
            // 본체로부터 호출 위임 (Delegate)
        service.someMethod();
        // 본체 위임 메서드 실행 후
        System.out.println("After()");
    }
}
