package ProgrammersLevelZero;

public class question106 {
    public static void main(String[] args) {
        String solution = new Solution06().solution("0010");
        System.out.println("solution = " + solution);
    }
}

class Solution06 {
    public String solution(String n_str) {
        String answer = new String();
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.toCharArray()[i] != '0') {
                for (int j = i; j < n_str.length(); j++) {
                    answer += String.valueOf(n_str.charAt(j));
                }
                return answer;
            }
        }
        return null;
    }
}