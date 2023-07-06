package easyCondingTest;

import java.util.ArrayList;
import java.util.List;

public class question35 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int[] solution = new Solution35().solution(arr);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

}

class Solution35 {
    public int[] solution(int[] arr) {
        List<Integer>stk = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size()-1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size()-1) >= arr[i]) {
                stk.remove(stk.size()-1);
            }
        }
        int[] answer = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);
        }
        return answer;
    }
}