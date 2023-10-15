package chap02._02encap.prevCode;

public class PreviousCodeExampleMain {
    public static void main(String[] args) {
        CalculatorCommand calculatorCommand = new CalculatorCommand(null, 100, 0);
        Client client = new Client();
        int result = client.someMethod(calculatorCommand);
        System.out.println(result);
    }
}
