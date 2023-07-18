package ProgrammersLevelOne;

import java.util.Arrays;

class Solution01 {
    public double solution(int[] arr) {
        // 자바는 몫 나눗셈과 소수점 나눗셈을 나눗셈을 시도하는 두 인자의 타입에 따라 결정됩니다.
        return (double) Arrays.stream(arr).sum() / arr.length;
    }
}
