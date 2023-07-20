package ProgrammersLevelOne;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution04 {
    public int[] solution(String[] wallpaper) {

        int sx = wallpaper[0].length();
        int sy = wallpaper.length;
        int ex = 0;
        int ey = 0;

        for(int i = 0; i < wallpaper.length; i++) {
            char[] column = wallpaper[i].toCharArray();
            if(wallpaper[i].contains("#")) {
                sy = Math.min(sy,i);
                ey = Math.max(ey,i);
                for(int j = 0; j < column.length; j++){
                    if(column[j] == '#'){
                        sx = Math.min(sx,j);
                        ex = Math.max(ex,j);
                    }
                }
            }
        }
        // 통상적인 좌표평면 개념과 다르게 세로(x),가로(y)인 조건이 있었으나
        // 가로(x), 세로(y)로 풀어서 서로 자리를 바꿔서 리턴
        return new int[] {sy,sx,ey+1,ex+1};
    }

    public static void main(String[] args) {
        int[] solution = new Solution04().solution(new String[]{".#...", "..#..", "...#."});

        for (int i : solution) {
            System.out.print(i+",");
        }
    }
}
