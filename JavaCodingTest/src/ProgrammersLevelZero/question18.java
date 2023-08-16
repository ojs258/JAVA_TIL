package ProgrammersLevelZero;

public class question18 {
    public static void main(String[] args) {
        int solution = new Solution18().solution(7);
        System.out.println("solution = " + solution);
    }
}
class Solution18 {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0) { // n이 짝수인지 아닌지 판별하는 분기점
            for (int i = 0; i <= n; i++) {
                answer += i % 2 == 0 ? i * i : 0;
            } //짝수라면 n보다 작은 짝수의 제곱을 전부 더해준다.
        } else {// n이 짝수가 아니라면 홀수로 판단하는 분기점
            for (int i = 0; i <= n; i++) {
                answer += i % 2 != 0 ? i : 0;
            } //홀수라면 n보다 작은 홀수를 전부 더해준다.
        }
        return answer; // 위 로직이 만든 값을 리턴
    }
}