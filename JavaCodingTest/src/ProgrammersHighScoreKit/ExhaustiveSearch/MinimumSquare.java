package ProgrammersHighScoreKit.ExhaustiveSearch;

import java.util.*;

public class MinimumSquare {
    class Solution {
        public int solution(int[][] sizes) {
            List<Integer> big = new ArrayList<>();
            List<Integer> small = new ArrayList<>();
            // 무조건 가로로 넣는 명함 지갑 이라고 가정
            // 가로와 세로중 큰 값을 가로로 보이게 배열 정보를 수정
            // 가로중 가장 큰 값 * 세로중 가장 큰 값 = 정답.
            for(int i = 0; i < sizes.length; i++) {
                if(sizes[i][0] > sizes[i][1]) {
                    big.add(sizes[i][0]);
                    small.add(sizes[i][1]);
                } else {
                    big.add(sizes[i][1]);
                    small.add(sizes[i][0]);
                }
            }
            return big.stream().max(Comparator.comparingInt(o -> o)).get() * small.stream().max(Comparator.comparingInt(o -> o)).get();
        }
        public int solution1(int[][] sizes) {
            int width = 0;
            int heigth = 0;

            // 풀고 나서 본 정답 코드
            // 가로 세로 배열을 재배치 해서 가장 큰 값을 구하는 걸 한번해 해버리고
            // 그렇게 구해진 가로 * 세로 = 정답.
            for(int[] size : sizes) {
                width = Math.max(width, Math.max(size[0], size[1]));
                heigth = Math.max(heigth, Math.min(size[0], size[1]));
            }

            return width * heigth;
        }
    }
}
