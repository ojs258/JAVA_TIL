package ProgrammersLevelZero;

import java.util.Arrays;

public class question83 {
    public static void main(String[] args) {
        String[] solution = new Solution83().solution(new String[]{"and","notad","abcd"});
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}

class Solution83 {
    public String[] solution(String[] strArr) {
        Object[] tmp = Arrays.stream(strArr).filter(str -> !(str.contains("ad"))).toArray();
        String[] answer = new String[tmp.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = String.valueOf(tmp[i]);
        }
        return answer;
    }
}