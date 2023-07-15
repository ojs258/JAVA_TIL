package programmersLevelZero;

import java.util.Arrays;

public class question100 {
    public static void main(String[] args) {
        int[] solution = new Solution00().solution(new int[]{12, 4, 15, 46, 38, 2, 14});
    }
}

class Solution00 {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().limit(5).toArray();
    }
}