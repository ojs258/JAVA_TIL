package chap02._02encap.prevCode;

public class Client {
    public int someMethod(CalculatorCommand calculatorCommand){
        // 연산 요청에 필요한 모든 정보를 얻어오는 와중에
        // getter 가 노출되어서 calculateCommand내부에 무슨 멤버 변수가 존재하는지 확인 가능.
        CalculatorType calculatorType = calculatorCommand.getCalculatorType();
        int num1 = calculatorCommand.getNum1();
        int num2 = calculatorCommand.getNum2();
        return calculatorType.calculate(num1,num2);
    }
}
