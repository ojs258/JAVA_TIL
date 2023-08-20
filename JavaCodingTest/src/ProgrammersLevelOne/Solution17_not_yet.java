package ProgrammersLevelOne;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution17_not_yet {

    public int solution(int[] ingredient) {
        List<Integer> ingredientList = Arrays.stream(ingredient).boxed().collect(Collectors.toList());
        Stack<Integer> stk = new Stack<>();
        int answer = 0;


        for(int i = 0; i < ingredient.length - 3; i++) {
            String burger = "";
            stk.push(ingredient[i]);
            burger += String.valueOf(stk.peek());
            for(int j = i + 1 ; j < i + 4; j++) {
                burger += String.valueOf(ingredient[j]);
            }
            if(burger.equals("1231")) {
                answer++;
                stk.pop();
                i += 4;
            }
        }

        return answer;
    }
}
