package ProgrammersLevelZero;

public class question55 {
    public static void main(String[] args) {
        int solution = new Solution55().solution(new int[]{0,0,0,1},1);
        System.out.println("solution = " + solution);
    }
}
class Solution55 {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = arr.length - 1; i >= idx; i--) {
            if (arr[i] == 1) {
                answer = i;
            }
        }
        return answer;
    }
}