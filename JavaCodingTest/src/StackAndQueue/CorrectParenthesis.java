package StackAndQueue;

public class CorrectParenthesis {
    boolean solution(String s) {
        char[] str = s.toCharArray();
        boolean answer = false;
        int cnt = 0;
        if(str[0] == ')') return false;
        for (char c : str) {
            cnt = c == '(' ? 1 : -1;
        }
        return cnt <= 0;
    }
}
