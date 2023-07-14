package programmersLevelZero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class question95 {
    public static void main(String[] args) {
        int[] solution = new Solution95().solution(new int[]{0,1,1},3);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution95 {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int[] answer = Arrays.stream(arr).distinct().limit(k).toArray();
        if (answer.length < k){
            for (int i = 0; i < answer.length; i++) {
                tmp.add(answer[i]);
            }
            for (int i = answer.length - 1; i < k; i++) {
                tmp.add(-1);
            }
            return tmp.stream().mapToInt(n -> n).toArray();
        } else {
            return answer;
        }
    }
}