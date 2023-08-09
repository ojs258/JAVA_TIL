package StackAndQueue;

import java.util.ArrayList;
import java.util.List;

public class IHateSameNumber {
    public int[] solution(int[] arr) {
        List<Integer> nums = new ArrayList<>();
        nums.add(arr[0]);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                nums.add(arr[i+1]);
            }
        }
        return nums.stream().mapToInt(n->n).toArray();
    }
    // 스택을 통해서 풀면 효율성 검사를 통과 하지 못해서 리스트로 풀이함.
    // 스택이나 큐를 이용해서 효율성 검사를 통과 하는 방법이 있을 수 있지만,
    // 1단계 문제여서 깊게 생각하지 않고 넘어감.
}
