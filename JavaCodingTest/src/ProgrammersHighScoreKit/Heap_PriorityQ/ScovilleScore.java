package ProgrammersHighScoreKit.Heap_PriorityQ;

import java.util.PriorityQueue;

public class ScovilleScore {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // heap 자료구조에 스코빌 배열을 다 넣어준다.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        // pq를 순회하면서 top의 값이 K보다 낮으면
        // 문제에서 제시된 공식대로 계산 후 다시 넣어준다.
        // 다시 넣기만 해도 heap자료구조의 특성상 바로 정렬된 위치에 들어간다.
        // 모든 스코빌 지수를 목표 스코빌 지수를 넘길때까지 반복한다.
        // 이 때 모든 음식의 스코빌 지수를 다 섞어도 목표 스코빌 지수를 넘지 못할때
        // 모든 음식의 스코빌 지수는 K이상으로 만들 수 없다고 판단 -1 리턴한다.
        while(!pq.isEmpty()) {
            if(pq.peek() < K){
                if(pq.size() == 1) {
                    return -1;
                }
                pq.offer(pq.poll() + (pq.poll() * 2));
                answer++;
            } else {
                pq.poll();
            }
        }
        return answer;
    }
}
