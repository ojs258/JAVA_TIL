package programmersLevelZero;

public class question79 {
    public static void main(String[] args) {
        String solution = new Solution79().solution("PrOgRaMmErS");
        System.out.println("solution = " + solution);
    }
}

class Solution79 {
    public String solution(String myString) {
        char[] answer = myString.toLowerCase().toCharArray();

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i] == 'a' ? 'A' : answer[i];
        }

        return String.valueOf(answer);
    }
}