package ProgrammersLevelOne;

public class Solution11 {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        char cond = ' ';
        int[] cnt = new int[2];
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            // 컨디션 문자열의 길이와 그 외 문자열의 길이가 같을 때
            // answer를 +1 해주고 변수들을 초기화
            // 문자열 전체가 조건이 만족하지 않아도 +1은 나와야하므로
            // 한칸씩 당겨서 미리 answer +1 해주는 형태로 구현
            if(cnt[0]==cnt[1]){
                answer++;
                cond = arr[i];
                cnt = new int[2];
            }
            // 이번 문자가 기준 문자와 같으면 0번에 +1 아니면 1번에 +1
            if(cond == arr[i]) {
                cnt[0]++;
            } else {
                cnt[1]++;
            }
        }
        return answer;
    }
}
