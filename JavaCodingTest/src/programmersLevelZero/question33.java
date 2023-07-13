package programmersLevelZero;

public class question33 {
    public static void main(String[] args) {
        int[] solution = new Solution33().solution(3, 10);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution33 {
    public int[] solution(int start, int end) {
        int len = (end-start) + 1;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            answer[i] = i + start;
        }
        return answer;
    }
}