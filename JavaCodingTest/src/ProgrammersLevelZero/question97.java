package ProgrammersLevelZero;

import java.util.Arrays;

public class question97 {
    public static void main(String[] args) {
        int solution = new Solution97().solution(new int[]{49,13}, new int[]{49,13});

        System.out.println("solution = " + solution);
    }
}

class Solution97 {
    public int solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        if(len1 == len2){
            if(sum1 == sum2){
                return 0;
            } else {
                return sum1 > sum2 ? 1 : -1;
            }

        } else {
            return len1 > len2 ? 1 : -1;
        }
    }
}