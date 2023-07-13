package programmersLevelZero;

public class question22 {
    public static void main(String[] args) {
        boolean[] booleans = {true, false, false, true, true};
        int solution = new Solution22().solution(3, 4, booleans);
        System.out.println("solution = " + solution);
    }
}
class Solution22 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]){
                answer += a;
            }
            a += d;
        }
        return answer;
    }
}