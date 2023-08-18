package ProgrammersHighScoreKit.StackAndQueue;

import java.util.*;

public class StockPrice {
    public int[] solution(int[] prices) {
        Stack<Integer> stk = new Stack<>();
        int[] answer = new int[prices.length];

        // 배열을 정방향으로 탐색한다.
        for(int i = 0; i < prices.length; i++) {
            // while문의 조건은
            // 비교군이 준비 되어있고(!stk.isEmpty())
            // 가격 하락이 발생할 때(prices[i] < prices[stk.peek()])
            // 라는 의미이다.
            while(!stk.isEmpty() && prices[i] < prices[stk.peek()]) {
                // 가격 감소가 발생한 인덱스 i
                // 가장 최근에 비교군 Stack에 push된 값(하락 발생 직전 인덱스) stk.pop()부터
                // 역순으로 가격 하락이 의미없는 값(예시 배열의 1번 인덱스)까지 비교해준다.
                answer[stk.peek()] = i - stk.pop();
            }
            // 정방향 탐색하면서 계속 비교군을 채워넣어준다.
            stk.push(i);
        }

        // 처음부터 끝가지 한 번 도 가격 하락의 영향을 받지 않는 값들은
        // 배열의 마지막 인덱스(prices.length - 1) 빼기
        // 영향을 받지 않아 스택에 남은 인덱스 stk.pop()을 넣어준다.
        while(!stk.isEmpty()) {
            answer[stk.peek()] = (prices.length - 1) - stk.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] ints = new StockPrice().solution(new int[]{1, 2, 3, 2, 3});

        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
    }
}
