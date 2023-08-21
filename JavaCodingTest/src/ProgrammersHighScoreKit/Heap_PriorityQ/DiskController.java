package ProgrammersHighScoreKit.Heap_PriorityQ;

import java.util.*;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        int total = 0;
        int index = 0;
        int cnt = 0;
        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>();

        while (cnt < jobs.length) {
            while (index < jobs.length && jobs[index][0] <= total) {
                pq.offer(jobs[index++]);
            }
        }

        return 9;
    }
}