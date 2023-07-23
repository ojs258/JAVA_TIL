package ProgrammersLevelOne;

public class Solution09 {
    public int solution(String t, String p) {
        int answer = 0;
        int cond = (p.length() - 1);
        for(int i = 0; i < t.length() - cond; i++) {
            // 문자열을 숫자로 변환해서 비교하되 비교문자열 p의 최대크기가 18이므로
            // 숫자로 치환했을때 18자리 이상 표현할 수 있는 Long타입 사용
            if(Long.parseLong(t.substring(i,i + p.length())) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
