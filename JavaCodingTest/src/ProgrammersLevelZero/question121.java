package ProgrammersLevelZero;

public class question121 {
    public static void main(String[] args) {
        int[][] solution = new Solution021().solution(3);
        for (int[] ints : solution) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}

class Solution021 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0, y = 0, cnt = 1;
        int[]dx = {1, 0, -1, 0};
        int[]dy = {0, 1, 0, -1};
        int direction = 0;

        while(cnt <= n*n){
            answer[y][x] = cnt++;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n || answer[ny][nx] != 0){
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }

        return answer;
    }
}