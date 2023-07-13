package programmersLevelZero;

public class question54 {
    public static void main(String[] args) {
        int[] solution = new Solution54().solution(10,3);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
class Solution54 {
    public int[] solution(int start, int end) {
        int[] answer = new int[(start - end) + 1];
        for (int i = 0, cnt = start; i < answer.length; i++, cnt--) {
            answer[i] = cnt;
        }
        return answer;
    }
}