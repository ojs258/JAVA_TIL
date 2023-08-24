package ProgrammersHighScoreKit.Sort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MostBigNumber {
    public String solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();

        for (int num : numbers) {
            list.add(num);
        }

        list.sort((o1, o2) -> {
            String s1 = String.valueOf(o1);
            String s2 = String.valueOf(o2);
            return Integer.parseInt(s2 + s1) - Integer.parseInt(s1 + s2);
        });
        String answer = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        return answer.charAt(0) == '0' ? "0" : answer;
    }
}