package chap02._01lessIf.earlyReturn;


public class Client {
    public int someMethod(CalculatorCommand calculatorCommand){
        CalculatorType calculatorType = calculatorCommand.getCalculatorType();
        int num1 = calculatorCommand.getNum1();
        int num2 = calculatorCommand.getNum2();

        // Early Return의 핵심
            // 로직 수행 전에 아예 리턴 구문과 함께 앞 쪽에 검사로직을 배치하는 것
            // return이 실행되는 순간 메서드는 그대로 종료되기 때문에
            // 핵심 로직을 불완전한 상태로 수행하지 않음
        if(calculatorType == null) return 0;
        if(calculatorType.equals(CalculatorType.DIVIDE) && num2==0) throw new RuntimeException("분모가 0입니다.");
        else return
                    switch(calculatorType){
                        case ADD -> num1 + num2;
                        case MINUS -> num1 - num2;
                        case MULTIPLY -> num1 * num2;
                        case DIVIDE -> num1 / num2;
                    };
    }
}
