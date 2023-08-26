package ProgrammersHighScoreKit.Sort;

import java.util.Arrays;

public class H_Index {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int max = 0;

        for(int i = 0; i < citations.length; i++) {
            int tmp = Math.min(citations[i],citations.length - i);
            max = Math.max(max, tmp);
        }
        return max;
    }
}
