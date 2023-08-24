package ProgrammersHighScoreKit.Heap_PriorityQ;

import java.util.*;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> que = new LinkedList<>();
        Deque<Integer> dq = new LinkedList<>();
        for(String str : operations) {
            String[] oper = str.split(" ");
            if(oper[0].equals("I")) {
                pq.offer(Integer.parseInt(oper[1]));
            }else {
                dq.clear();
                while(!pq.isEmpty()) {
                    dq.offer(pq.poll());
                }
                if(!dq.isEmpty()) {
                    if(Integer.parseInt(oper[1]) > 0) {
                        dq.pollLast();
                    } else {
                        dq.pollFirst();
                    }
                }
                pq.clear();
                while(!dq.isEmpty()) {
                    pq.offer(dq.poll());
                }
            }
        }
        dq.clear();
        while(!pq.isEmpty()) {
            dq.offer(pq.poll());
        }

        if(dq.isEmpty()) {
            return new int[]{0,0};
        } else if(dq.size() == 1) {
            return new int[] {dq.peek(),dq.poll()};
        } else {
            return new int[] {dq.pollLast(),dq.pollFirst()};
        }
    }
    public static void main(String[] args) {
        int[] solution = new DoublePriorityQueue().solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

