package chap02._03stream.foreach;

import java.util.stream.IntStream;

public class ForeachIterationExampleMain {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 7)
                .map(num -> num*10)
                .filter(num -> num<=40)
                .forEach(
                    num -> {
                        System.out.println(num == 40 ?"40찾았다!" :String.valueOf(num));
                    }
        );
    }
}
