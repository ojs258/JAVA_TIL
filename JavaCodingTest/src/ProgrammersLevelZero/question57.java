package ProgrammersLevelZero;

public class question57 {
    public static void main(String[] args) {
        int solution = new Solution57().solution(new int[]{12, 4, 15, 46, 38, -2, 15});

        System.out.println("solution = " + solution);
    }
}
class Solution57 {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}