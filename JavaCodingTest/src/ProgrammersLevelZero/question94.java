package ProgrammersLevelZero;

import java.util.ArrayList;

public class question94 {
    public static void main(String[] args) {
        int[] solution = new Solution94().solution(new int[]{0,0,0,0});

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
class Solution94 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0; int j = 0;
        while(i < arr.length){
            if(stk.size() == 0) {
                stk.add(arr[i]);
            } else if(stk.get(j) != arr[i]) {
                stk.add(arr[i]); j++;
            } else {
                stk.remove(j); j--;
            }
            i++;
            j = j < 0 ? 0 : j; // 연달아서 같은 숫자가 들어가서 j index가 음수로 가는걸 막는 코딩
        }
        int[] answer = stk.stream().mapToInt(n -> n).toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}