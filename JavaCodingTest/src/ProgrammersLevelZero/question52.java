package ProgrammersLevelZero;

import java.util.ArrayList;

public class question52 {
    public static void main(String[] args) {
        int[] solution = new Solution52().solution(10, 3);

        for (int i : solution) {
            System.out.print("  i = " + i);
        }
    }
}
class Solution52 {
    public int[] solution(int n, int k) {
        ArrayList<Integer> tmp = new ArrayList();

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                tmp.add(i);
            }
        }
        int[] answer = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}