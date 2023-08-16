package ProgrammersLevelZero;

import java.util.Arrays;

public class question98 {
    public static void main(String[] args) {
        int solution = new Solution98().solution(new String[]{"a","bc","d","efg","hi"});

        System.out.println("solution = " + solution);
    }
}

class Solution98 {
    public int solution(String[] strArr) {
        int[] tmp = Arrays.stream(strArr).mapToInt(String::length).toArray();
        int maxLen = Arrays.stream(tmp).max().getAsInt();
        int[] answer = new int[maxLen + 1];
        for (int i = 0; i < strArr.length; i++) {
            answer[tmp[i]]++;
        }
        return Arrays.stream(answer).max().getAsInt();
    }
}