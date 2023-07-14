package programmersLevelZero;

import java.util.ArrayList;

public class question93 {
    public static void main(String[] args) {
        int[] solution = new Solution93().solution(new int[]{1,2,1,1,1}, new boolean[]{true, false, true, false, false});

        for (int i : solution) {
            System.out.println("i = " + i);
        }

    }
}
class Solution93 {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]){
                for (int j = 0; j < (arr[i]*2); j++){
                    answer.add(arr[i]);
                }
            } else {
                int len = answer.size() - 1;
                for(int j = len; j >= len - (arr[i] - 1); j--) {
                    answer.remove(j);
                }
            }
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }
}