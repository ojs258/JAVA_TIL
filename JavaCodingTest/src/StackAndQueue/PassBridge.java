package StackAndQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PassBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 다리는 건너고 있는 자동차의 상태를 추적해야함
        // 마지막엔 대기하는 자동차 목록, 다리는 건너는 자동차 목록이 전부 0이면 리턴.
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>(Arrays.asList(truck_weights));

        while(!q.isEmpty()){
            // 매 초 다리의 상황에 따라 자동차를 올릴지 말지 정함.
            for(int i = 0; i < bridge_length; i++) {
                // weight를 초과 하는지 검사, bridge_length를 초과 하는지 검사
                boolean isWeight = true;/*weight - bridge.stream().sum() > q.peek();*/
                boolean isLength = bridge.size() < bridge_length
                if( isWeight && isLength ) {
                    bridge.offer(q.poll());
                }
                if(answer > bridge_length)
                    answer++;
            }
        }
        return 1;
    }
}
