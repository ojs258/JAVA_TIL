package school.week4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindZero {
    public static int[] solution(int... arr) {
        int zeroCnt = 0;
        for (int i : arr) {
            zeroCnt += i == 0 ? 1 : 0;
        }
        List<Integer> answer = Arrays.stream(arr).filter(n -> n != 0).boxed().collect(Collectors.toList());

        for (int i = 0; i < zeroCnt; i++) {
            answer.add(0);
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }

    public static void main(String[] args) {
        for (int i : solution(6, 0, 8, 2, 3, 0, 4, 0, 1)) {
            System.out.println(i);
        }
    }
}
