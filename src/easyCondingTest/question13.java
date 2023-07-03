package easyCondingTest;

public class question13 {
    public static void main(String[] args) {
        System.out.println(new Solution13().solution("String", 5));
    }
}

class Solution13 {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        // 파라미터로 넘어온 문자열 my_string과 숫자 k, for문을 이용해
        // my_string을 k번 answer에 이어붙혀서 저장해준다.
        return answer;
    }
}