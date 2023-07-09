package easyCondingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class question56 {
    public static void main(String[] args) {
        int[] solution1 = new Solution56().solution(1, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] solution2 = new Solution56().solution(2, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] solution3 = new Solution56().solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] solution4 = new Solution56().solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        for (int i : solution1) {
            System.out.print("  1 = " + i);

        }
        System.out.println();


        for (int i : solution2) {
            System.out.print("  2 = " + i);
        }
        System.out.println();


        for (int i : solution3) {
            System.out.print("  3 = " + i);
        }
        System.out.println();


        for (int i : solution4) {
            System.out.print("  4 = " + i);
        }
    }
}
class Solution56 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList tmp = new ArrayList();

        switch (n) {
            case 1:
                return Arrays.copyOfRange(num_list,0,slicer[1]+1);
            case 2:
                return Arrays.copyOfRange(num_list,slicer[0],num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list,slicer[0],slicer[1]+1);
            default:
                int[] nums = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
                for (int i = 0; i < nums.length; i = i + 2) {
                    tmp.add(nums[i]);
                }

        }
        int[] answer = new int[tmp.size()];

        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = (int)tmp.get(i);
        }
        return answer;
    }
}