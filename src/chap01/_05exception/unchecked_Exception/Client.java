package chap01._05exception.unchecked_Exception;

public class Client {
    public void tryCatchUncheckedExceptionMethod(){
        try{
            throw new UncheckedException();
        }catch (UncheckedException e){
            e.printStackTrace();
        }
        new UncheckedException();
    }

    public void throwsUncheckedExceptionMethod() throws UncheckedException{
        throw new UncheckedException();
    }
}
