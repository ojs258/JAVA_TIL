package ProgrammersHighScoreKit.Heap_PriorityQ;

import java.util.*;
import java.util.stream.Collectors;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        int index = 0;
        int jCnt = 0;
        int total = 0;

        // 제한 사항중 " 하드디스크가 작업을 수행하고 있지 않을 때에는 먼저 요청이 들어온 작업부터 처리합니다. " 로
        // 미루어 보아 들어온 요청의 순서대로 정렬 해야함.
        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));

        // 요청 순서 다음으로는 걸리는 시간 순서대로 정렬하도록 Heap을 선언
        PriorityQueue<Job> pq = new PriorityQueue<>(Comparator.comparingInt(j -> j.during));

        // 코드를 조금 깔끔하게 하려고 리스트로 변환
        List<Job> jList = Arrays.stream(jobs)
                .map(j -> new Job(j[0],j[1]))
                .collect(Collectors.toList());

        // 요청을 전부 수행할 때까지 반복
        while(jCnt < jList.size()) {

            // 전체 진행도와 요청의 시작시점을 공유하는 경우 pq에 offer함
            // 전체 진행도와 요청 시작 시점을 공유한다는 개념은
            // 필연적으로 진행되어야하는 최소
            while(index < jList.size() && jList.get(index).start <= total) {
                pq.offer(jList.get(index++));
            }

            if(!pq.isEmpty()) {
                total += pq.peek().during;
                answer += total - pq.poll().start;
                jCnt++;
            } else {
                total += jList.get(index).start - total;
            }
        }

        return (int) (answer / jList.size());
    }
    public static void main(String[] args) {
//        int i = new DiskController().solution(new int[][]{{1,9},{2,6},{0,3},{1,7},{7,1},{6,2},{20,1}});
        int i = new DiskController().solution(new int[][]{{1,9},{2,6},{0,3}});
        System.out.println("i = " + i);
    }
}
class Job {
    int start;
    int during;

    public Job(int start, int during) {
        this.start = start;
        this.during = during;
    }
}