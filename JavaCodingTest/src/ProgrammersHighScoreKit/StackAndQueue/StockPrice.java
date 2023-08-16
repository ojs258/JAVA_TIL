package ProgrammersHighScoreKit.StackAndQueue;

import java.util.*;

public class StockPrice {
    public int[] solution(int[] prices) {
        // 가격의 등락을 비교
        // 가격 하락이 발생하면 하락이 발생한 인덱스를 배열에 저장
        // 하락 정보를 기반으로 정답 배열을 만들어서 리턴

        List<Integer> down = new ArrayList<>();
        int[] answer = new int[prices.length];
        Arrays.fill(answer,1);
        answer[prices.length - 1] = 0;
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

    public int[] solution1(int[] prices) {

        // 가격 하락이 발생하면 하락이 발생한 인덱스를 스택에 저장
        // 가격 등락 정보 배열을 탐색
        // 스택에 저장된 인덱스가 가지는 값보다 크면 정답배열에 인덱스를 저장
        // 반복

        int[] answer = new int[prices.length];
        // 마지막 시점을 제외한 모든 시점의 가격이 최소 1초는 유지 되므로
        // 아래 두 줄의 코드로 배열을 초기화
        Arrays.fill(answer,1);
        answer[prices.length - 1] = 0;

        Stack<Integer> stk = new Stack<>();
        for(int i = 1; i < prices.length; i++) {
            if(prices[i-1] > prices[i]) {
                stk.push(i);
            }
        }

        while(!stk.isEmpty()) {
            int price = stk.pop();
            for(int i = 0; i <= price-1; i++){
                if(prices[i] > prices[price]){
                    answer[i] = price - i;
                } else {
                    answer[i] = (prices.length-1) - i;
                }
            }
        }
        return answer;
    }

    public int[] solution3(int[] prices) {
        Stack<Integer> downPrices = new Stack<>();
        int max = prices.length - 1;
        downPrices.push(max);
        int[] answer = new int[max];
        for(int i = max -1; i < 0; i++){
            if(prices[i] < prices[i-1]) downPrices.push(i);
        }


        while(!downPrices.isEmpty()) {
            int downPriceIndex = downPrices.pop();
            for(int i = 0; i < downPriceIndex; i++) {
                answer[i] = prices[i] > prices[downPriceIndex]
                        ? downPriceIndex - i
                        : downPriceIndex - i;
            }
        }
        return answer;
    }
}
