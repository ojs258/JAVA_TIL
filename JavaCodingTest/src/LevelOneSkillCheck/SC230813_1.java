package LevelOneSkillCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SC230813_1 {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();

        for(int[] arr : commands) {
            int[] temp = Arrays.copyOfRange(array,arr[0]-1,arr[1]);
            Arrays.sort(temp);
            answer.add(temp[arr[2] - 1]);
        }
        return answer.stream().mapToInt(n -> n).toArray();

        // arraycopy로 자르기
        // 자른 배열 정렬
        // 자른 배열의 인덱스 -1을 출력
    }
}
