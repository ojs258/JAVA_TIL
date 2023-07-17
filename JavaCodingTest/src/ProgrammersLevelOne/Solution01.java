package ProgrammersLevelOne;

import java.util.Arrays;

class Solution01 {
    public double solution(int[] arr) {
        return (double)Arrays.stream(arr).sum() / arr.length;
    }
}