package easyCondingTest;

public class question28 {
    public static void main(String[] args) {
        String solution = new Solution28().solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2,-1});

        System.out.println("solution = " + solution);
    }
}

class Solution28 {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            if(numLog[i-1] < numLog[i]){
                answer += numLog[i] - numLog[i-1] == 10 ? 'd' : 'w';

            }else{
                answer +=  numLog[i-1] - numLog[i] == 10 ? 'a' : 's';
            }
        }
        return answer;
    }
}
