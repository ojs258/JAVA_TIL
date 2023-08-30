package ProgrammersHighScoreKit.ExhaustiveSearch;

import java.util.ArrayList;
import java.util.List;

public class ExTest {
    public int[] solution(int[] answers) {
        int[] stu1 = new int[]{1,2,3,4,5};
        int[] stu2 = new int[]{2,1,2,3,2,4,2,5};
        int[] stu3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if(stu1[i % stu1.length] == answers[i]) { cnt[0]++; }
            if(stu2[i % stu2.length] == answers[i]) { cnt[1]++; }
            if(stu3[i % stu3.length] == answers[i]) { cnt[2]++; }
        }
        int max = Math.max(cnt[0],Math.max(cnt[1],cnt[2]));
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < cnt.length; i++) {
            if(max == cnt[i]) {
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }
}
