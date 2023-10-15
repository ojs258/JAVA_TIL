package chap01._04enum.adv;

// 주어진 연산자를 통해 계산을 수행하라는 명령에 대한 정보를 묶어서 저장중인 클래스
public class CalculatorCommand {
    private CalculatorType calculatorType;
    private int num1;
    private int num2;

    public CalculatorCommand(CalculatorType calculatorType, int num1, int num2) {
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
