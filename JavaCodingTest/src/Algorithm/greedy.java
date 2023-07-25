package Algorithm;

public class greedy {
    public int greedy(int n, int s, int e, int[][]edges){
        // 최대 노드 개수 n, 시작 노드 s,목표 노드 e
        int[] edge = new int[n+1];
        int[] visited = new int[n+1];
        //배열전체를 최대값으로 초기화
        for (int i = 0; i < edge.length; i++) {
            edge[i] = Integer.MAX_VALUE;
        }
        edge[s] = 0;
        visited[s] = 1;
        return 0;
    }

    public static void main(String[] args) {
        new greedy().greedy(6,1,6,new int[][]{{1,2,3},{2,3,4},{3,4,9},{3,5,15},{5,2,1},{5,4,1},{5,6,10}})
    }
}
