package easyCondingTest;

import java.util.Arrays;

public class question62 {
    public static void main(String[] args) {
        int[] solution = new Solution62().solution(new int[]{2,1,6}, 1);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution62 {
    public int[] solution(int[] num_list, int n) {
        int[] frontNArr = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] behindNArr = Arrays.copyOfRange(num_list,0,n);
        int[] answer = new int[frontNArr.length + behindNArr.length];
        int frontLen = frontNArr.length;

        System.arraycopy(frontNArr, 0, answer, 0,frontLen);
        System.arraycopy(behindNArr, 0, answer, frontLen, answer.length - frontLen);
        return answer;
    }
}