package chap01._03abstractLayer.interface_class;

public class ImplementClass implements SomeInterface, AnotherInterface{
    @Override
    public void anotherMethod() {
        System.out.println("ImplementsClass anotherMethod()");
    }
    @Override
    public void someMethod() {
        System.out.println("ImplementsClass someMethod()");
    }
}
