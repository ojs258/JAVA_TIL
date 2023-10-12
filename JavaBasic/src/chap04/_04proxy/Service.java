package chap04._04proxy;

public class Service implements SomeInterface{
    @Override
    public void someMethod() {
        System.out.println("실제 객체의 someMethod()를 실행했습니다.");
    }
}
