package ProgrammersLevelZero;

import java.util.ArrayList;

public class question96 {
    public static void main(String[] args) {
        int[] solution = new Solution96().solution(new int[]{1,1});

        for (int i : solution) {
            System.out.println(i);
        }
    }
}

class Solution96 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            int sqrt = (int) Math.pow(2,i);
            if (arr.length <= sqrt) {
                for (int j = 0; j < arr.length; j++){
                    answer.add(arr[j]);
                }
                for (int j = arr.length; j < sqrt; j++){
                    answer.add(0);
                }
            }
            return answer.stream().mapToInt(n -> n).toArray();
        }
        return new int[0];
    }
}