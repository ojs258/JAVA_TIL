package chap02._02encap.setterCode;

import java.util.function.BiFunction;

public enum CalculatorType {
    // 일급 객체 (변수에 저장할 수 있거나 파라미터에 넣을 수 있는 자료형)
      // -> 람다에서 제한적으로나마 메서드를 일급객체로 사용할 수 있게 되었다.
    ADD (Integer::sum),
    MINUS ((num1, num2) -> num1-num2),
    MULTIPLY ((num1, num2) -> num1*num2),
    DIVIDE ((num1, num2) -> num1/num2);

    // 각 ENUM자료형에 물려있는 함수의 형식에 대해서 멤버변수로 표현
    CalculatorType(BiFunction<Integer, Integer, Integer> expression) {
        this.expression = expression;
    }

    // expression은 각 이늄 자료에 매칭된 함수이므로
    // 선언자료형은 BiFunction<>
    //     -> CalculateType에 어떤 enum자료를 대입하냐에 따라 해당 로직을 호출할 수 있음
    private BiFunction<Integer, Integer, Integer> expression;

    public int calculate(int num1, int num2){
        // num1, num2를 받아 특정 enum에 매칭된 람다를 실행하기
            // BiFunction자료형은 .apply()를 통해 해당 변수에 담긴 람다를 실행
        return this.expression.apply(num1, num2);
    }
}
