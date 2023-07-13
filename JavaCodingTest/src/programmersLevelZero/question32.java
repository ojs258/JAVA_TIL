package programmersLevelZero;

import java.util.ArrayList;
import java.util.List;

public class question32 {
    public static void main(String[] args) {
        int[] solution = new Solution32().solution(5, 555);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution32 {
    public int[] solution(int l, int r) {
        List<Integer> tmp = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            char[] number = String.valueOf(i).toCharArray();
            int numCount = 0;
            for (char c : number) {
                if(c == '5' || c == '0') {
                    numCount++;
                }
            }
            if (number.length == numCount) {
                tmp.add(i);
            }
        }
        int[] answer = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        if(tmp.size() == 0){
            return new int[]{-1} ;
        }
        return answer;
    }
}