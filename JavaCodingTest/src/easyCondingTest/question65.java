package easyCondingTest;

import java.util.ArrayList;

public class question65 {
    public static void main(String[] args) {
        int[] solution = new Solution65().solution(new int[]{4, 2, 6, 1, 7, 6},2);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution65 {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num_list.length; i += n) {
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(num -> num).toArray();
    }
}