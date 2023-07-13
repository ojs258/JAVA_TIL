package programmersLevelZero;

import java.util.Arrays;

public class question72 {
    public static void main(String[] args) {
        int solution = new Solution72().solution(new int[]{1, 2, 3, 100, 99, 98});

        System.out.println("solution = " + solution);
    }
}
class Solution72{
    public int solution(int[] arr) {
        int cond = 0;
        int[] arrA = arr;
        int [] arrB = Arrays.stream(arr).map(n ->
                        n >= 50 ?
                                n % 2 == 0 ? n / 2 : n // 50 보다 크거나 같고 짝수면 n/2 아니면 n
                                : n % 2 != 0 ? n * 2 + 1 : n) // 50 보다 작고 홀수면 n * 2 아니면 n
                .toArray();
        while (!Arrays.equals(arrA, arrB)) {
            arrA = arrB;
            arrB = Arrays.stream(arrA).map(n ->
                            n >= 50 ?
                                    n % 2 == 0 ? n / 2 : n // 50 보다 크거나 같고 짝수면 n/2 아니면 n
                                    : n % 2 != 0 ? n * 2 + 1 : n) // 50 보다 작고 홀수면 n * 2 아니면 n
                    .toArray();
            cond++;
        }
        return cond;
    }
}