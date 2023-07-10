package easyCondingTest;

import java.util.Arrays;

public class question61 {
    public static void main(String[] args) {
        int[] solution = new Solution61().solution(new int[]{2,1,6},3);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution61 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}