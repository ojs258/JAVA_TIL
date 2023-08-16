package ProgrammersLevelZero;

import java.util.ArrayList;

public class question59 {
    public static void main(String[] args) {
        int[] solution1 = new Solution59().solution(new int[]{1, 2, 1, 4, 5, 2, 9});
        int[] solution2 = new Solution59().solution(new int[]{1, 2, 1});
        int[] solution3 = new Solution59().solution(new int[]{1, 1, 1});
        int[] solution4 = new Solution59().solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1});

        for (int i : solution1) {
            System.out.println("i = " + i);
        }
    }
}
class Solution59 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> findIndex = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                findIndex.add(i);
            }
        }
        if (findIndex.size() == 0) {
            return new int[]{-1};
        }
        for (int i = findIndex.get(0); i <= findIndex.get(findIndex.size()-1); i++) {
            answer.add(arr[i]);
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }
}