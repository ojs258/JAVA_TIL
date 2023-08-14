package StackAndQueue;

import java.util.*;

public class PassBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 매초 단위로 answer를 +1 시켜주면서 시뮬레이션한다.
        // 다리의 상태를 확인하고 자동차를 다리위로 보낸다.
        // 다리를 건너고 있는 자동차의 상태를 추적해 내려가야 할 때 내려보낸다.
        // 마지막엔 대기하는 자동차 목록, 다리는 건너는 자동차 목록이 전부 0이면 리턴.
        int answer = 0;
        boolean cond = false;
        List<Car> bridge = new ArrayList<>();
        Queue<Integer> restCar = new LinkedList<>(Arrays.asList(Arrays.stream(truck_weights)
                .boxed()
                .toArray(Integer[]::new)));
        int bridgeWeight = 0;
        while(!restCar.isEmpty() || !bridge.isEmpty()){
            // 다리의 조건에따른 자동차를 다리위로 올려보내는 로직
            if(!restCar.isEmpty()){
                boolean isWeight = weight - bridgeWeight > restCar.peek();
                boolean isLength = bridge_length > bridge.size();
                if(isWeight && isLength) {
                    int carWeight = restCar.poll();
                    bridgeWeight += carWeight;
                    bridge.add(new Car(carWeight, bridge_length));
                }
            }
            // 초 단위 시뮬 카운트 answer;
            answer++;
            // 1초가 흘렀으므로 다리위의 차들을 1칸씩 이동시키고
            // 남은 이동거리가 0인 차들을 다리에서 내려보내는 로직
            for(int i = 0; i < bridge.size(); i++){
                bridge.get(i).moveCnt--;
                if(bridge.get(i).moveCnt == 0){
                    bridgeWeight -= bridge.get(i).weight;
                    bridge.remove(bridge.get(i));
                }
            }
        }
        return answer;
    }
}

class Car {
    int weight;
    int moveCnt;

    public Car(int weight, int moveCnt) {
        this.weight = weight;
        this.moveCnt = moveCnt;
    }
}