package ProgrammersLevelZero;

import java.util.Arrays;

public class question118 {
    public static void main(String[] args) {
        int[] solution = new Solution018().solution(new int[]{1, 2, 3, 100, 99, 98},5);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
class Solution018 {
    public int[] solution(int[] arr, int k) {
        return k % 2 == 0 ? Arrays.stream(arr)
                .map(n -> n + k)
                .toArray()
                : Arrays.stream(arr)
                .map(n -> n * k)
                .toArray();
    }
}