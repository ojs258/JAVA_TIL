package programmersLevelZero;

import java.util.Arrays;

public class question60 {
    public static void main(String[] args) {
        int[] solution = new Solution60().solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{5, 1, 2});

        for (int i : solution) {
            System.out.print(i+",");
        }
    }
}
class Solution60 {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        for (int i = 0; i < query.length; i++) {
            if(i % 2 == 0){
                answer = Arrays.copyOfRange(answer, 0, query[i]+1);
            } else {
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }
        return answer;
    }
}