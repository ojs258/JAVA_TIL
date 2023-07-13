package programmersLevelZero;

public class question50 {
    public static void main(String[] args) {
        String solution = new Solution50().solution(3, 1, "qjnwezgrpirldywt");

        System.out.println(solution);
    }
}

class Solution50 {
    public String solution(int q, int r, String code) {
        char[] tmp = code.toCharArray();
        String answer = new String();

        for (int i = 0; i < tmp.length; i++) {
            if(i % q == r) {
                answer += tmp[i];
            }
        }
        return answer;
    }
}