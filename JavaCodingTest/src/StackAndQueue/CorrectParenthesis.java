package StackAndQueue;

public class CorrectParenthesis {
    boolean solution(String s) {
        char[] str = s.toCharArray();
        boolean answer = false;
        int cnt = 0;
        for (char c : str) {
            // '('이걸 만나면 +1 ')' 이걸 만나면 -1을 한다.
            cnt += c == '(' ? 1 : -1;
            // 이 때 cnt가 음수가 되는 순간이 오면
            // 괄호가 열리지 않았는데 닫히는 케이스 이므로 false를 리턴한다.
            if(cnt < 0) return false;
        }
        // 짝이 맞으면 cnt는 무조건 0이므로 true를 리턴
        return cnt == 0;
    }
}
