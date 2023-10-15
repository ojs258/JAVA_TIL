package chap04._02facade;

public class Client {

    public void someMethod(){
        new SendMessageFacade().sendSave();
    }
}
