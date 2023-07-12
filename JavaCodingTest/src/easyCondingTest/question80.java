package easyCondingTest;

public class question80 {
    public static void main(String[] args) {
        String solution = new Solution80().solution("programmers","p");
        System.out.println("solution = " + solution);
    }
}

class Solution80 {
    public String solution(String my_string, String alp) {
        char[] answer = my_string.toCharArray();
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i] == alp.charAt(0)
                    ? alp.toUpperCase().charAt(0) : answer[i];
        }
        return String.valueOf(answer);
    }
}