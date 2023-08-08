package StackAndQueue;

import java.util.Stack;

public class IHateSameNumber {
    public int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(!(stk.peek()==arr[i])){
                stk.push(arr[i]);
            }
        }
        return stk.stream().mapToInt(n -> n).toArray();
    }
    public static void main(String[] args) {
        int[] solution = new IHateSameNumber().solution();
    }
}
