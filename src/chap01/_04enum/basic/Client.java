package chap01._04enum.basic;

public class Client {
    public int someMethod(CalculatorCommand calculatorCommand){
        CalculatorType calculatorType = calculatorCommand.getCalculatorType();
        int num1 = calculatorCommand.getNum1();
        int num2 = calculatorCommand.getNum2();

        return
            switch(calculatorType){
                case ADD -> num1 + num2;
                case MINUS -> num1 - num2;
                case MULTIPLY -> num1 * num2;
                case DIVIDE -> num1 / num2;
            };
    }
}
