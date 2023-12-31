package school.week3;

import java.util.Arrays;

public class MultipleOrPlus {
    public static int solution(String str) {
        int[] array = Arrays.stream(str.strip().split(""))
                .mapToInt(Integer::parseInt)
                .map(n -> n == 0 ? 1 : n)
                .toArray();
        int answer = 1;
        for (int i : array) {
            answer *= i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution1 = solution("02984");
        int solution2 = solution("576");
        System.out.println("solution = " + solution1);
        System.out.println("solution = " + solution2);
    }
}
