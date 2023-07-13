package programmersLevelZero;

import java.util.ArrayList;
import java.util.Arrays;

public class question86 {
    public static void main(String[] args) {
        int[] solution = new Solution86().solution("oxooxoxxox");

        for (int i : solution) {
            System.out.println("i = " + i);
        }

    }
}

class Solution86 {
    public int[] solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;
        for(int i : Arrays.stream(myString.split("x")).mapToInt(n -> n.length()).toArray()) {
            answer.add(i);
        }
        if (myString.charAt(myString.length()-1) == 'x') {
            answer.add(0);
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }
}