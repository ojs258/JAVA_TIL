package chap03._01lsp;

public class Child extends Parent{
    @Override
    public void someMethod(int input) {
        //  자식은 양수만 처리할 수 있도록 재정의
        if(input <= 0){
            throw new RuntimeException("양수만 받을 수 있습니다!!!");
        }
    }
}
