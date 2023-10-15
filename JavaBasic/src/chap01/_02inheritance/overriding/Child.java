package chap01._02inheritance.overriding;

public class Child extends Parent {
    // Parent쪽 자원은 private 요소를 제외한 나머지를 모두 가짐.

    // 부모쪽 메서드와 시그니처(메서드명, 리턴자료형, 파라미터의 종류 등)은 같으나 실행 구문이 달라짐
    @Override
    public void someMethod(){
        System.out.println("Child someMethod");
    }
}
