package StackAndQueue;
import java.util.*;

public class PriorityQueue {
    public int solution(int[] priorities, int location) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < priorities.length; i++) {
            map.put(i,priorities[i]);
        }

        Queue<Integer> q = new LinkedList<>(
                Arrays.asList(Arrays.stream(priorities)
                        .boxed()
                        .toArray(Integer[]::new)));
        return 1;

    }
    // index
    // priority 내림차순
    // rank
}
