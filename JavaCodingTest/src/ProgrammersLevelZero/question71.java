package ProgrammersLevelZero;

import java.util.Arrays;

public class question71 {
    public static void main(String[] args) {
        int[] solution = new Solution71().solution(new int[]{1,2,3,100,99,98});

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution71 {
    public int[] solution(int[] arr) {

        return Arrays.stream(arr).map(n ->
                        n >= 50 ?
                        n % 2 == 0 ? n / 2 : n // 50 보다 크거나 같고 짝수면 n/2 아니면 n
                        : n % 2 != 0 ? n * 2 : n) // 50 보다 작고 홀수면 n * 2 아니면 n
                .toArray();
    }
}