package easyCondingTest;

import java.util.Arrays;

public class question66 {
    public static void main(String[] args) {
        int solution = new Solution66().solution(new int[]{4, 2, 6, 1, 7, 6});
        System.out.println("solution = " + solution);
    }
}

class Solution66 {
    public int solution(int[] num_list) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if((i + 1) % 2 == 0) {
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }
        return Math.max(evenSum, oddSum);
    }
}