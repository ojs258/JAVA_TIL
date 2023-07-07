package easyCondingTest;

import java.util.Arrays;

public class question45 {
    public static void main(String[] args) {
        int solution = new Solution45().solution("banana","ana");

        System.out.println("solution = " + solution);
    }
}

class Solution45 {
    public int solution(String my_string, String is_suffix) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = (my_string.substring(i,my_string.length()));
        }
        Arrays.sort(answer);
        return Arrays.stream(answer).anyMatch(n -> n.equals(is_suffix)) ? 1 : 0;
    }
}