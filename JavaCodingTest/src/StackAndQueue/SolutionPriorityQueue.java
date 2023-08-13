package StackAndQueue;
import java.util.*;

public class SolutionPriorityQueue {
    public int solution(int[] priorities, int location) {

        int rank = 0;

        // 우선 순위 큐를 통해 문제가 원하는 방식의 정렬을 해준다.
        // 내림차순으로 정렬 될 때까지 배열의 요소들은 왼쪽 쉬프트연산한 결과물과 같다.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : priorities) {
            pq.offer(num);
        }
        // 배열을 탐색하면서 배열의 값과 큐의 front의 값이 같으면 큐에서 값을 빼버린다.
        // 위와 같은 순서로 코딩은 하지만 생각은 반대 개념이나 코드도 자세히보면
        // 큐를 탐색하는 행위를 반복하는 while문이 배열을 탐색하는 for문을 감싸고 있다.
        // 정렬된 큐의 순서대로 배열의 인덱스를 찾아서 location값과 비교하는 모양으로도 볼 수 있다.
        // 이 때 큐의 값과 배열이 값이 같은 순간, 큐의 우선 순위 순위를 하나씩 매긴다, rank++;
        // 순위를 매기고 나서 배열의 인덱스가 location값과 같으면 그 때의 rank가 location이 가르키는 값의 우선 순위이다.
        // 해당 값을 리턴한다.

        while(!pq.isEmpty()){
            for(int i = 0; i < priorities.length; i++) {
                if(priorities[i] == pq.peek()) {
                    pq.poll();
                    rank++;
                    if(i == location){
                        return rank;
                    }
                }
            }
        }
        return 1;
    }
}
