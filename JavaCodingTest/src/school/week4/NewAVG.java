package school.week4;

import java.util.Arrays;
import java.util.OptionalInt;

public class NewAVG {
    public static float solution(int i, int... score) {
        //점수 / 최고 * 100
        int maxScore = Arrays.stream(score).max().getAsInt();
        float newScoreSum = 0;
        for (int k : score) {
            newScoreSum += (float) k / maxScore * 100;
        }
        return newScoreSum / i;
    }

    public static void main(String[] args) {
        System.out.println("solution = " + solution(3, 40, 80, 60));
    }
}
