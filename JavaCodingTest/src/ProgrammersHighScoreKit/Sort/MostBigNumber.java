package ProgrammersHighScoreKit.Sort;

import java.util.*;
import java.util.stream.Collectors;

public class MostBigNumber {
    public String solution(int[] numbers) {

        List<String> list = new ArrayList<>();
        for(int num : numbers) {
            list.add(String.valueOf(num));
        }
        list.sort(new Comparator<String>(){
            public int compare(String s1, String s2) {
                for(int i = 0; i < s1.length(); i++) {
                    for(int j = 0; j < s2.length(); j++) {
                        if(s1.charAt(i) > s2.charAt(i)) {
                            return s1.length() < s2.length() ? -1 : 1;
                        } else {
                            return s1.length() < s2.length() ? -1 : 1;
                        }
                    }
                }
                return 0;
            }
        });

        return list.stream().collect(Collectors.joining());
    }
}