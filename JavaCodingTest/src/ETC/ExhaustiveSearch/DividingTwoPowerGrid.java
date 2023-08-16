package ETC.ExhaustiveSearch;

import java.util.*;

/*
* 완전 탐색(ETC.ExhaustiveSearch) - 너비 우선 탐색,BFS(BreadthFirstSearch)
* 프로그래머스 전력망을 둘로 나누기 - 86971
* */
public class DividingTwoPowerGrid {
    static int[][] graph;
    public int solution(int n, int[][] wires) {
        graph = new int[n+1][n+1];
        int answer = n;
        // 인접 정보를 그래프로 변환
        for (int i = 0; i < wires.length; i++) {
            graph[wires[i][0]][wires[i][1]] = 1;
            graph[wires[i][1]][wires[i][0]] = 1;
        }

        // 엣지를 하나씩 끊어가며 노드를 탐색
        for(int i = 0; i < wires.length; i++) {
            graph[wires[i][0]][wires[i][1]] = 0;
            graph[wires[i][1]][wires[i][0]] = 0;

            answer = Math.min(answer,bfs(n,wires[i][0]));

            // 끊었던 엣지를 복원
            graph[wires[i][0]][wires[i][1]] = 1;
            graph[wires[i][1]][wires[i][0]] = 1;
        }
        return answer;
    }
    //트리 탐색

    public int bfs(int size, int start) {
        boolean[] visited = new boolean[size+1];
        Deque<Integer> q = new LinkedList<>();
        int cnt = 0;
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int node = q.poll();
            cnt++;
            for(int j = 1; j < graph[node].length; j++) {
                if(graph[node][j] == 1 && !visited[j]) {
                    q.offer(j);
                    visited[j] = true;
                }
            }
        }
        return Math.abs(size - (2 * cnt)); //두 전력망의 노드 수 차의 절대값 구하는 식
    }
}
