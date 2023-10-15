package chap01._03abstractLayer.interface_class;

public class ImplementClassExampleMain {
    public static void main(String[] args) {
        SomeInterface someInterface = new ImplementClass();
        AnotherInterface anotherInterface = new ImplementClass();

        someInterface.someMethod();
        someInterface.defaultMethod();
        anotherInterface.anotherMethod();

        ImplementClass implementClass = new ImplementClass();

        // 양쪽 모두를 호출하는건 불가능.
//        someInterface.anotherMethod();
//        anotherInterface.someMethod();
//        anotherInterface.defaultMethod();

        // implementsClass 구현체 타입으로는 양쪽 모두 호출 가능
        implementClass.someMethod();
        implementClass.anotherMethod();
    }
}
