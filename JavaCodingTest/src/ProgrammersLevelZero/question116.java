package ProgrammersLevelZero;

import java.util.Arrays;

public class question116 {
    public static void main(String[] args) {
        int solution = new Solution016().solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"});

        System.out.println("solution = " + solution);
    }
}
class Solution016 {
    public int solution(String[] order) {
        return (int) ((Arrays.stream(order)
                .filter(str -> str.contains("americano"))
                .count() +
                Arrays.stream(order)
                        .filter(str -> str.contains("anything"))
                        .count()) * 4500
                + Arrays.stream(order)
                .filter(str -> str.contains("cafelatte"))
                .count() * 5000);
    }
}