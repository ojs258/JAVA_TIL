package ProgrammersHighScoreKit.ExhaustiveSearch;

import java.util.Arrays;

public class minimumSquare {
    class Solution {
        public int solution(int[][] sizes) {
            int[] width = new int[sizes.length];
            int[] height = new int[sizes.length];

            int w = Arrays.stream(width).max().getAsInt();
            int h = Arrays.stream(height).max().getAsInt();

            return 0;
        }
    }
}
