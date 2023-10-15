package chap02._02encap.setterCode;


public class Client {
    public int someMethod(CalculatorCommand calculatorCommand){
        // 클라이언트는 연산 결과를 달라고만 주문하면 됨.
        // 결합도가 낮아짐 -> 외부 클래스에 대한 호출 구문 라인 수가 줄어듦
        return calculatorCommand.getCalculatorResult();
    }
}
