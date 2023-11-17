package school.week3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ATM {
    public static int solution(int a) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < a; i++) {
            nums.add(scanner.nextInt());
        }
        nums.sort(Comparator.reverseOrder());
        for (int i = 0; i < a; i++) {
            for (Integer num : nums) {
                answer += num;
            }
            nums.remove(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(5);
        System.out.println("solution = " + solution);
    }
}
