package easyCondingTest;

import java.util.Arrays;
public class question58 {
    public static void main(String[] args) {
        int[] solution = new Solution58().solution(new int[]{1,99,58,56,94,12,3},new int[][]{{1,6},{0,6}});

        for (int i : solution) {
            System.out.print(i+" ");
        }
    }
}
class Solution58 {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] intArr1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] intArr2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        int[] answer = new int[intArr1.length + intArr2.length];

        for (int i = 0; i < intArr1.length; i++) {
            answer[i] = intArr1[i];
        }
        for (int i = 0; i < intArr2.length; i++) {
            answer[i+intArr1.length] = intArr2[i];
        }
        return answer;
    }
}