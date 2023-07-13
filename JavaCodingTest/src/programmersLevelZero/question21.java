package programmersLevelZero;

public class question21 {
    public static void main(String[] args) {
        String solution = new Solution21().solution("abc1abc1abc");
        System.out.println("solution = " + solution);
    }
}

class Solution21 {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char tmp = code.charAt(i); // String을 배열처럼 사용할 수 있게 도와주는 charAt메서드를 이용해 인덱스로 참조한다.
            if (tmp == '1') { // 이번 인덱스의 글자가 1이라면 모드를 변경해준다.
                mode = mode == 0 ? 1 : 0;
            } else if (mode == 0) { // 모드가 0이면 인덱스가 짝수인지 검사하고 인덱스와 매칭되는 글자를 더 해준다.
                answer += i % 2 == 0 ? tmp : "";
            } else{ // 나머지경우 (모드가 1이면) 인덱스가 홀수인지 검사하고 인덱스와 매칭되는 글자를 더 해준다.
                answer += i % 2 != 0 ? tmp : "";
            }
        }
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}