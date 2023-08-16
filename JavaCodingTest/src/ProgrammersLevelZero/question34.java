package ProgrammersLevelZero;

import java.util.ArrayList;
import java.util.List;

public class question34 {
    public static void main(String[] args) {
        int[] solution = new Solution34().solution(10);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution34 {
    public int[] solution(int n) {
        List<Integer> tmp = new ArrayList<>();

        while(n != 1) {
            if(n % 2 == 0) {
                tmp.add(n);
                n = n / 2;
            }else {
                tmp.add(n);
                n = (n * 3) + 1;
            }
        }
        tmp.add(1);
        int[] answer = new int[tmp.size()];

        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        
        return answer;
    }
}