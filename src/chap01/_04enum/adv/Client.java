package chap01._04enum.adv;


public class Client {
    public int someMethod(CalculatorCommand calculatorCommand){
        return CalculatorType.ADD.calculate(5, 10);
    }
}

//        CalculatorType calculatorType = calculatorCommand.getCalculatorType();
//        return calculatorType.calculate(calculatorCommand.getNum1(), calculatorCommand.getNum2());