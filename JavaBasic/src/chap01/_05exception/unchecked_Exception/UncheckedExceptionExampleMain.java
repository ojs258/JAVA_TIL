package chap01._05exception.unchecked_Exception;

public class UncheckedExceptionExampleMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.throwsUncheckedExceptionMethod();
        client.tryCatchUncheckedExceptionMethod();
    }
}
