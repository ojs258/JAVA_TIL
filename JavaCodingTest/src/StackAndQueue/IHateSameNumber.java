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
}
