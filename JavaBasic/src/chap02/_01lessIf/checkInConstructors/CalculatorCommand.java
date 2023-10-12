package chap02._01lessIf.checkInConstructors;

// 주어진 연산자를 통해 계산을 수행하라는 명령에 대한 정보를 묶어서 저장중인 클래스
public class CalculatorCommand {
    private CalculatorType calculatorType;
    private int num1;
    private int num2;

    // CalculatorCommand 객체에 실질적인 연산에 필요한 모든 자료가 저장되므로
    // 연산에 필요한 정보를 생성하는 단계에서 검사까지 해버리면 됨.
    public CalculatorCommand(CalculatorType calculatorType, int num1, int num2) {
        if(calculatorType == null) throw new RuntimeException("타입이 정해지지 않았습니다.");
        if(calculatorType.equals(CalculatorType.DIVIDE) && num2==0) throw new RuntimeException("분모가 0입니다.");

        this.calculatorType = calculatorType;
        this.num1 = num1;
        this.num2 = num2;
    }

    public CalculatorType getCalculatorType() {
        return calculatorType;
    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
}
