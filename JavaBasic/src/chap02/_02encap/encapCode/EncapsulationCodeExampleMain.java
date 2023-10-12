package chap02._02encap.encapCode;

public class EncapsulationCodeExampleMain {
    public static void main(String[] args) {
        CalculatorCommand calculatorCommand = new CalculatorCommand(CalculatorType.ADD, 100, 5);
        Client client = new Client();
        System.out.println(client.someMethod(calculatorCommand));
    }
}
