package easyCondingTest;

import java.util.ArrayList;
import java.util.List;

public class question41 {
    public static void main(String[] args) {
        int[] solution = new Solution41().solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5);
        for (int i = 0; i < solution.length; i++) {
            System.out.println("solution = " + solution[i]);
        }
    }
}
class Solution41 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> tmp = new ArrayList<>();
        for (String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s+l));
            if (num > k) {
                tmp.add(num);
            }
        }
        int[] answer = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}