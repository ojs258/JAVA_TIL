package chap02._02encap.setterCode;

// 주어진 연산자를 통해 계산을 수행하라는 명령에 대한 정보를 묶어서 저장중인 클래스
public class CalculatorCommand {
    private CalculatorType calculatorType;
    private int num1;
    private int num2;

    // setter로 추후 주입할 수 있도록 setter만 두기
    public void setCalculatorType(CalculatorType calculatorType) {
        this.calculatorType = calculatorType;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // CalculatorCommand 객체에 실질적인 연산에 필요한 모든 자료가 저장되므로
    // 연산에 필요한 정보를 생성하는 단계에서 검사까지 해버리면 됨.
//    public CalculatorCommand(CalculatorType calculatorType, int num1, int num2) {
//        if(calculatorType == null) throw new RuntimeException("타입이 정해지지 않았습니다.");
//        if(calculatorType.equals(CalculatorType.DIVIDE) && num2==0) throw new RuntimeException("분모가 0입니다.");
//
//        this.calculatorType = calculatorType;
//        this.num1 = num1;
//        this.num2 = num2;
//    }

    // 생성자에서 이미 유효성 검사가 완료되었고,
    // setter가 없기에 값이 변하지 않는 것까지 보장되므로 바로 연산
    public int getCalculatorResult() {
        return calculatorType.calculate(num1, num2);
    }
}
