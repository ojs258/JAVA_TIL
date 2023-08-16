package ProgrammersLevelZero;

import java.util.stream.Collectors;

public class question119 {
    public static void main(String[] args) {
        String solution = new Solution019().solution("abcdevwxyz");
        System.out.println("solution = " + solution);
    }
}
class Solution019 {
    public String solution(String myString) {
        String array = myString.chars()
                .mapToObj(n -> n < 'l'
                        ? "l"
                        : String.valueOf((char)(n)))
                .collect(Collectors.joining());

        return array;
    }
}