package chap02._01lessIf.manyIf;

public class Client {
    public int someMethod(CalculatorCommand calculatorCommand){
        CalculatorType calculatorType = calculatorCommand.getCalculatorType();
        int num1 = calculatorCommand.getNum1();
        int num2 = calculatorCommand.getNum2();

        // 1. CalculateType이 null이라면 연산이 되지 않아야함. -> null 검사를 매 로직마다 해줘야함
        // 2. Divide 시에 num2가 0이라면? -> 0인지 검사해서 0이면 예외를 발생시키고 아니면 처리해야함
        // 위 2개 이슈를 해결할 수 있는 방식으로 if문을 고쳐야함.
        if(calculatorType == null) throw new RuntimeException("타입이 정해지지 않았습니다.");
        else if(calculatorType.equals(CalculatorType.DIVIDE) && num2==0) throw new RuntimeException("분모가 0입니다.");
        else return
                switch(calculatorType){
                    case ADD -> num1 + num2;
                    case MINUS -> num1 - num2;
                    case MULTIPLY -> num1 * num2;
                    case DIVIDE -> num1 / num2;
                };
    }
}
