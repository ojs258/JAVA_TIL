package ProgrammersLevelZero;

import java.util.Arrays;

public class question24 {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 2, 1};
        int[] arr2 = {5, 7, 8, 3};

        int solution1 = new Solution24().solution(arr1);
        int solution2 = new Solution24().solution(arr2);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);

    }
}

class Solution24 {
    public int solution(int[] num_list) {
        int sum_pow = (int)Math.pow(Arrays.stream(num_list).sum(),2);
        int multiple = 1;
        for (int i : num_list) {
            multiple *= i;
        }
        return sum_pow > multiple ? 1 : 0;
    }
}