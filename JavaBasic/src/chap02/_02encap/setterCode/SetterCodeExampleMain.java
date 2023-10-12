package chap02._02encap.setterCode;

public class SetterCodeExampleMain {
    public static void main(String[] args) {
        // 빈 객체를 기본 생성자로 생성
        CalculatorCommand calculatorCommand = new CalculatorCommand();
        calculatorCommand.setCalculatorType(CalculatorType.ADD);
        calculatorCommand.setNum1(100);
        calculatorCommand.setNum2(5);

        Client client = new Client();
        int result = client.someMethod(calculatorCommand);
        System.out.println(result);
    }
}
