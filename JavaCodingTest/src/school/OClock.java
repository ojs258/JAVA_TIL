package school;

public class OClock {
    public int solution(int n) {
        int answer = 0;
        // 60을 기준으로 3이 포함되는 경우의 수는 15
        // 1시간의 15분은 1분당 60초로 셈함 -> 900번 3이 포함됨
        // 1시간의 45분은 1분당 15초로 셈함 -> 675번 3이 포함됨
        // 시간에 3이 포함되면 전체 시간(60분)을 모두 세어서 초로 셈 -> 총 계산 횟수: (60 * 분)
        // 고로 시간에 '3'이 포함되면, 해당 시간당 (60 * 분) 초를 더해줌
        // 시간에 '3'이 포함되지 않으면, 해당 시간당 (15 * 분) 초를 더해줌
        for (int i = 0; i <= n; i++) {
            if (String.valueOf(i).contains("3")) {
                answer += 3600;
            } else
                answer += 1575;
            }
        return answer;
    }

    public static void main(String[] args) {
        int solution = new OClock().solution(5);
        System.out.println(solution);
    }
}
