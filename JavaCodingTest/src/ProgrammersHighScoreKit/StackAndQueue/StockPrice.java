package ProgrammersHighScoreKit.StackAndQueue;

import java.util.*;

public class StockPrice {
    // 일단 효율성 테스트 빼고 다 통과 되는 코드
    public int[] solution(int[] prices) {
        Stack<Integer> downPrices = new Stack<>();
        int max = prices.length - 1;

        int[] answer = new int[prices.length];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < prices[i-1]) downPrices.push(i);
        }
        downPrices.push(max);

        while(!downPrices.isEmpty()) {
            int downIndex = downPrices.pop();
            for(int i = 0; i < downIndex; i++) {
                if(prices[i] > prices[downIndex]){
                    answer[i] = downIndex - i;
                } else if(answer[i] == 0) {
                    answer[i] = max - i;
                }
            }
        }
        return answer;
    }
}
