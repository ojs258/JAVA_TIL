package ProgrammersHighScoreKit.StackAndQueue;

import java.util.*;

public class FunctionalDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> restDays = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        // 남은 일 수 구하기
        // 그 다음 값들이 현재 인덱스의 값보다 작으면 cnt++;
        // List에 추가하고 Array로 바꿔서 리턴.
        for(int i = 0; i < progresses.length; i++) {
            // 남은 진행도 / 속도 = 남은 일 수
            int restProg = 100 - progresses[i];
            int restDay = restProg / speeds[i];
            restDays.offer(restProg % speeds[i] == 0 ? restDay : restDay + 1);
        }
        restDays.offer(101);
        int cond = restDays.poll();
        int cnt = 1;
        int size = restDays.size();
        for(int i = 0; i < size; i++) {
            if(cond < restDays.peek()){
                answer.add(cnt);
                cnt = 1;
                cond = restDays.poll();
            } else {
                restDays.poll();
                cnt++;
            }
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }
    // 수학으로 정리해서 각 기능의 진행도 마다 필요한 일 수를 구한다.
    // 일수가 더 작으면 넘어가고 더 크면 해당 값으로 컨디션을 바꿔주고
    // 배포를 진행한다.
}
