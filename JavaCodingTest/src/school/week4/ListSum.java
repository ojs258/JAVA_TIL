package school.week4;

import java.util.Arrays;

public class ListSum {
    public static int solution(int i, String num) {
        return Arrays.stream(num.split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("solution = " + solution(25, "7000000000000000000000000"));
        System.out.println("solution = " + solution(5, "54321"));
        System.out.println("solution = " + solution(11, "10987654321"));
    }
}
