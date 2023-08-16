package ProgrammersLevelZero;

import java.util.ArrayList;

public class question109 {
    public static void main(String[] args) {
        int[] solution = new Solution09().solution(new int[]{293, 1000, 395, 678, 94},new int[]{94, 777, 104, 1000, 1, 12});

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
class Solution09 {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }

        for (int i = 0; i < delete_list.length; i++) {
            if(answer.contains(delete_list[i])){
                answer.remove(answer.indexOf(delete_list[i]));
            }
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }
}