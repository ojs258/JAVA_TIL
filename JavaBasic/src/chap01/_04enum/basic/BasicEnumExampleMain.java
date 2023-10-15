package chap01._04enum.basic;

public class BasicEnumExampleMain {
    public static void main(String[] args) {
        CalculatorCommand calculatorCommand = new CalculatorCommand(
                CalculatorType.ADD, 10, 20
        );

        System.out.println(new Client().someMethod(calculatorCommand));
    }
}
