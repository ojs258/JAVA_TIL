package ProgrammersLevelZero;

import java.util.stream.IntStream;

public class question113 {
    public static void main(String[] args) {
        int solution = new Solution013().solution(new int[]{1, 2, 3, 4, 5}, 3);

        System.out.println("solution = " + solution);
    }
}
class Solution013 {
    public int solution(int[] num_list, int n) {
        return IntStream.of(num_list).anyMatch(num -> num == n) ? 1 : 0;
    }
}