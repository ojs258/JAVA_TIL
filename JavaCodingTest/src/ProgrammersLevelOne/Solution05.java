package ProgrammersLevelOne;

public class Solution05 {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        // 첫 벗겨진 지점에서 롤러로 칠하기 시작
        for(int num : section) {
            if (num > start + m - 1) {
                start = num;
                answer++;
            }
        }
/*
페인트가 벗겨진 부분이 발견 될 때마다
현재 롤러가 남은 페인트로 칠 할 수 있는 범위인지 확인
범위를 벗어난다면 롤러 횟수를 올리고 반복
*/
        return answer;
    }
}
