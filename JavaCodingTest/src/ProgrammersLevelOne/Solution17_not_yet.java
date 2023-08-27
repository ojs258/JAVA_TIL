package ProgrammersLevelOne;

import java.util.*;
import java.util.stream.Collectors;

public class Solution17_not_yet {
    public int solution(int[] ingredient) {
        List<Integer> list = new LinkedList<>(Arrays.asList(Arrays.stream(ingredient)
                .boxed()
                .toArray(Integer[]::new)));
        int answer = 0;
        int cnt = 0;
        String burger = "1231";
        for(int i = 0; i < list.size(); i++) {
            String newBurger = "";
            if(i == list.size() - 3) {
                return answer;
            }
            for(int j = i; j < 4 + i; j++) {
                newBurger += list.get(j);
            }
            if(burger.equals(newBurger)) {
                answer++;
                for(int k = i; k < 4 + i; k++) {
                    list.remove(i);
                }
                i -= 2;
            }
            if(list.size() < 4){
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        new Solution17_not_yet().solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
    }
}
