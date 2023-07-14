package programmersLevelZero;

import java.util.Arrays;
import java.util.stream.IntStream;

public class question101 {
    public static void main(String[] args) {
        int[] solution = new Solution01().solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10});

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution01 {
    public int[] solution(int[] num_list) {
        int[] tmp = Arrays.stream(num_list).sorted().toArray();
        int[] answer = new int[tmp.length - 5];

        for (int i = 5; i < tmp.length; i++) {
            answer[i - 5] = tmp[i];
        }
        return answer;
    }
}