package easyCondingTest;

public class question26 {
    public static void main(String[] args) {
        System.out.println(new Solution26().solution(new int[] {2,1,6}));
    }
}

class Solution26 {
    public int[] solution(int[] num_list) {
        int [] answer = new int[num_list.length+1];
        int lastIndex = num_list.length - 1;
        int result = num_list[lastIndex] > num_list[lastIndex - 1]
                ? num_list[lastIndex] - num_list[lastIndex - 1]
                : num_list[lastIndex] * 2;
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length-1] = result;
        return answer;
    }
}
