package programmersLevelZero;

import java.util.Arrays;

public class question120 {
    public static void main(String[] args) {
        int[][] solution = new Solution020().solution(3);
        for (int[] ints : solution) {
            System.out.print("[");
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println("]");
        }
    }
}
class Solution020 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < answer.length; i++){
            answer[i][i] = 1;
        }
        return answer;
    }
}