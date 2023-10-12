package school;

import java.util.HashMap;

public class Chess {
    public int solution(String start) {
        // 0을 제외하면 8*8
        int[][] ints = new int[9][9];
        HashMap<String, Integer> horizonMap = new HashMap<>();
        String[] strings = new String[]{"a","b","c","d","e","f","g","h"};
        Integer[] integers = new Integer[]{1,2,3,4,5,6,7,8};
        for (int i = 0; i < 8; i++) {
            horizonMap.put(strings[i],integers[i]);
        }
        // 문자열을 좌표로 치환
        int x = horizonMap.get(String.valueOf(start.charAt(0)));
        int y = Integer.parseInt(String.valueOf(start.charAt(1)));

        // 이동 가능 범위
        int[] knightX = {-1,1,-2,-2,2,2};
        int[] knightY = {2,2,-1,1,-1,1};

        int answer = 0;

        // 한 칸씩 이동 시켜보고 맵밖이 아니라면 answer++
        for(int i = 0; i < 6; i++) {
            int dx = x;
            int dy = y;
            dx += knightX[i];
            dy += knightY[i];

            if (dx > 1 && dy > 1 && dx < 9 && dy < 9){
                answer++;
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        Chess chess = new Chess();
        int solution = chess.solution("a1");
        System.out.println("solution = " + solution);
    }
}
