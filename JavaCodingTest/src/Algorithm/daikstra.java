package Algorithm;

import java.util.*;

public class daikstra {
    public int[] daiks(int n, int s, int[][]fares) {
        //간선정보를 이용해 구현할 무방향 가중치 그래프

        int[][] graph = new int[n+1][n+1];
        for (int i = 0; i < fares.length; i++) {
            graph[fares[i][0]][fares[i][1]] = fares[i][2];
            graph[fares[i][1]][fares[i][0]] = fares[i][2];
        }

        // 최단 경로를 저장할 배열 route
        int[] route = new int[n+1];
        Arrays.fill(route,Integer.MAX_VALUE);

        // 방문 여부를 체크할 배열 visited
        boolean[] visited = new boolean[n+1];
        Deque<Integer> q = new LinkedList<>();

        // 시작 노드 자기자신은 가중치를 0으로 초기화하고
        route[s] = 0;

        // 이미 방문한것으로 처리
        q.offer(s);
        visited[s] = true;

        while(!q.isEmpty()) {
            int node = q.poll();
            // 이번 노드와 연결된 노드들의 가중치 정보를 이용하여 최소 가중치를 갱신
            /*
            예시)
            1 -> 3 = 5 1번에서 3번은 가중치가 0 + 5 = 5임. (0은 자기자신을 탐색한 가중치)
            1 -> 2 = 1, 2 -> 3 = 3 1번에서 2번은 1, 2번에서 3번은 3 1 + 3은 4임
            ∴ 1 -> 3은 2를거쳐 가는 가중치 4로 갱신됨.
            */
            for (int j = 1; j < graph[node].length; j++) {
                //현재 중심노드와 간선이 연결되지 않은 노드는 탐색하지 않게 제한하는 if문
                if (graph[node][j] != 0){
                    route[j] = Math.min(route[node]+graph[node][j], route[j]);
                }
            }
            // 간선이 연결된 노드(graph[node][i]!= 0)중 에서
            // 방문한적 없는 노드 (!visited[i])의 경우 큐에 추가
            for (int i = 1; i < route.length; i++) {
                if (graph[node][i]!= 0 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
        return Arrays.copyOfRange(route,1,route.length);
    }

    public static void main(String[] args) {
        int[] shortCut = new daikstra().daiks(6, 4, new int[][]{{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}});

        for (int i : shortCut) {
            System.out.print(i + " ");
        }
    }
    // 최소 가중치 선택 루틴 -> 큐에 담을때 정렬하거나
}