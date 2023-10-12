package chap01._03abstractLayer.abstract_class;

public abstract class AbstractClass {
    public void implementedMethod(){
        System.out.println("AbstractClass implemented Method");
        this.abstractMethod();
    }
    abstract public void abstractMethod();
}
