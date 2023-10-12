package chap01._02inheritance.extends_;

public class Child extends Parent{
    // Parent쪽 자원은 private 요소를 제외한 나머지를 모두 가짐.

    // Child쪽에서 새롭게 정의하는 메서드
    public void anotherMethod(){
        System.out.println("Child anotherMethod");

        this.parentProtectedInt = 0;
        this.parentPublicInt = 0;
        // private 요소는 부모자식 관계에서도 호출 불가능
//        this.parentPrivateInt = 0;
    }
}
