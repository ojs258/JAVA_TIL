package ProgrammersLevelOne;

import java.util.*;
import java.util.stream.Collectors;

public class Solution14 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 주어진 과일 상품성 점수 배열을 내림차순으로 정렬해 리스트로 변환환다.
        List<Integer> sortScore = Arrays.stream(score)
                .boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int size = sortScore.size();
        // 내림차순으로 정렬된 과일들의 m번째 과일은 자동으로 꽉 찬 상자의 가장 점수가 낮은 과일이 된다.
        // 해당 과일의 점수 * m은 그 과일이 포함된 상자의 점수가 된다.
        for (int i = 1; i < sortScore.size(); i++) {
            if(i % m == 0){
                answer += sortScore.get(i-1) * m;
                size -= m;
                if (size < m) break;
            }
        }
        return answer;
    }

    // 위의 코드를 짧게 줄인 코드
    public int solution1(int k, int m, int[] score) {
        int answer = 0;

        List<Integer> sortScore = Arrays.stream(score)
                .boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for(int i = -1; i < sortScore.size()-m; i += m){
            answer += sortScore.get(i+m) * m;
        }

        return answer;
    }
}
