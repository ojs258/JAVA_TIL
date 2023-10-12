package chap01._02inheritance.overloaindg;

public class OverloadingExampleMain {
    public static void main(String[] args) {
        AddCalculator addCalculator = new AddCalculator();
        System.out.println(addCalculator.add(10, 20));
        System.out.println(addCalculator.add(30L, 40L));
        System.out.println(addCalculator.add(50f, 60f));
    }
}
