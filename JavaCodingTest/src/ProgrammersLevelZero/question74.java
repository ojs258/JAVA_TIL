package ProgrammersLevelZero;

public class question74 {
    public static void main(String[] args) {
        int solution = new Solution74().solution(new int[]{3,4,5,2,5,4,6,7,3,7,2,2,1});

        System.out.println("solution = " + solution);
    }
}

class Solution74 {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        for (int i : num_list) {
            sum += i;
            mul *= i;
        }
        return num_list.length > 10 ? sum : mul;
    }
}