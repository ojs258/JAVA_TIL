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
        downPrices.peek();
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

    public int[] solution1(int[] prices) {
        List<Integer> priceList = new ArrayList<>();
        Stack<Integer> downPrices = new Stack<>();
        int max = prices.length - 1;
        int[] answer = new int[prices.length];

        for(int i = 1; i < prices.length; i++){
            priceList.add(i-1);
            if(prices[i] < prices[i-1]) downPrices.push(i);
        }
        downPrices.push(max);

        List<Integer> temp = new LinkedList<>();
        while(!downPrices.isEmpty()) {
            int downIndex = downPrices.pop();
            for(int n : priceList) {
                if(prices[n] > prices[downIndex]) {
                    answer[n] = downIndex - n;
                    temp.add(n);
                } else if(answer[n] == 0) {
                    answer[n] = max - n;
                }
            }

            for(int n : temp) {
                priceList.remove(n);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ints = new StockPrice().solution1(new int[]{1, 2, 3, 2, 3});

        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
    }
}
