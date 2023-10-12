package chap01._04enum.adv;

public class AdvEnumExampleMain {
    public static void main(String[] args) {
        System.out.println(
                new Client()
                        .someMethod(
                            new CalculatorCommand(
                                CalculatorType.ADD,
                                10,
                                5
        )));
    }
}
