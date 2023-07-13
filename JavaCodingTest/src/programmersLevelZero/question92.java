package programmersLevelZero;

import java.util.ArrayList;
import java.util.Arrays;

public class question92 {
    public static void main(String[] args) {
        int[] solution = new Solution92().solution(new int[]{5,1,4});

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
class Solution92 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++){
                answer.add(arr[i]);
            }
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }
}