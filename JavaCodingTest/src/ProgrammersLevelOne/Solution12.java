package ProgrammersLevelOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution12 {
    public int[] solution(int k, int[] score) {
        List<Integer> rank = new ArrayList<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++){
            rank.add(score[i]);
            Collections.sort(rank, Collections.reverseOrder());
            if(rank.size() > k){
                rank.remove(k);
            }
            answer[i] = Collections.min(rank);
        }
        return answer;
    }
}
