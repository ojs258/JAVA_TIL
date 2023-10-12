package chap01._05exception.checkedException;


// Exception을 상속하는 클래스는 Checked exception이 된다.
// 이 경우, 해당 예외를 발생시킬 가능성이 있는 코드는 무조건 try-catch 구문을 써야함.
public class CheckedException extends Exception{}
