package programmersLevelZero;

import java.util.ArrayList;

public class question68 {
    public static void main(String[] args) {
        String[] solution = new Solution68().solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false});

        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}

class Solution68 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> tmp = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                tmp.add(todo_list[i]);
            }
        }
        String[] answer = new String[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}