package ProgrammersLevelZero;

import java.util.Arrays;

public class question64 {
    public static void main(String[] args) {
        int[] solution = new Solution64().solution(new int[]{5, 2, 1, 7, 5},3);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
class Solution64 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,0,n);
    }
}