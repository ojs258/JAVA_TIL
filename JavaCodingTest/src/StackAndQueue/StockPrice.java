package StackAndQueue;

import java.util.*;

public class StockPrice {
    public int[] solution(int[] prices) {
        // 가격의 등락을 비교
        // 가격 하락이 발생하면 하락이 발생한 인덱스를 배열에 저장
        // 하락 정보를 기반으로 정답 배열을 만들어서 리턴

        List<Integer> down = new ArrayList<>();
        int[] answer = new int[prices.length];
        for(int i = 1; i < prices.length; i++){
            // 정답 배열을 마지막 빼고 1로 초기화
            answer[i-1] = 1;
            // 가격이 하락하는 부분의 인덱스를 리스트에 추가
            if(prices[i-1] > prices[i]){
                down.add(i);
            }
        }
        int time = 0;
        int cond = 0;
        for(int i = 0; i < down.size(); i++) {
            time = down.get(i);
            for(int j = cond; j < time - 1; j++){
                answer[j] += time - j;
            }
            cond = down.get(i);
        }
        return answer;
    }
}
