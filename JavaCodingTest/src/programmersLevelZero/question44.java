package programmersLevelZero;

import java.util.Arrays;

public class question44 {
    public static void main(String[] args) {
        String[] solution = new Solution44().solution("banana");
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}

class Solution44 {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = (my_string.substring(i,my_string.length()));
        }
        Arrays.sort(answer);
        return answer;
    }
}