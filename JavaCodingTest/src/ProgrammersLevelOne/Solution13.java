package ProgrammersLevelOne;

public class Solution13 {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        for(int i = 2; i <= number; i++) {
            int cnt = 2;
            //j의 제곱이 i를 넘어가면 j는 이미 j가 낮은 수 일때 카운팅된 약수거나
            // 약수일 수가 없는 수이기 때문에 아래 조건 까지만 탐색한다.
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    // i의 제곱근이 j이면 1 아니면 2를 더한다.
                    cnt += i == j * j ? 1 : 2;
                }
            }
            // 2부터 number의 약수의 개수가 limit을 넘어가면 power로 대체
            answer += cnt > limit ? power : cnt;
        }
        return answer;
    }
}
