package chap04._04proxy;

public class Client {
    // 본체와 프록시 모두 같은 인터페이스의 구현체이기 때문에
    //      다형성도 만족할 수 있다.
    private final SomeInterface someInterface;
    public Client(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    public void someClientMethod(){
        someInterface.someMethod();
    }
}
