package chap02._01lessIf.checkInConstructors;

public class Cilent {
    public int someMethod(CalculatorCommand calculatorCommand){
        CalculatorType calculatorType = calculatorCommand.getCalculatorType();
        int num1 = calculatorCommand.getNum1();
        int num2 = calculatorCommand.getNum2();

        return 0;
    }
}
