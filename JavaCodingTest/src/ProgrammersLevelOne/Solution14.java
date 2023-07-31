package ProgrammersLevelOne;

import java.util.*;
import java.util.stream.Collectors;

public class Solution14 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        List<Integer> sortScore = Arrays.stream(score)
                .boxed()
                .collect(Collectors.toList());
        sortScore.sort(Comparator.reverseOrder());

        Iterator<Integer> iterator = sortScore.iterator();
        return answer;
    }
}
