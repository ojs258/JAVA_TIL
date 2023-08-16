package ProgrammersLevelZero;

public class question69 {
    public static void main(String[] args) {
        int solution = new Solution69().solution(new int[]{34, 5, 71, 29, 100, 34}, 123);

        System.out.println("solution = " + solution);
    }
}

class Solution69 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            answer += answer > n ? 0 : number;
        }
        return answer;
    }
}