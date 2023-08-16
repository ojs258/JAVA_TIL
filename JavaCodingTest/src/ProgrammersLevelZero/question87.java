package ProgrammersLevelZero;

import java.util.Arrays;

class question87 {
    public static void main(String[] args) {
        String[] solution = new Solution87().solution("dxccxbbbxxaaaa");
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
class Solution87{
    public String[] solution(String myString) {
        String[] answer = Arrays.stream(myString.split("x"))
                .sorted().filter(str -> !str.isBlank())
                .toArray(String[]::new);
        return answer;
    }
}