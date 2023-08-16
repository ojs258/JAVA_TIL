package ProgrammersLevelZero;

public class question25 {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 2, 1};
        int[] arr2 = {5, 7, 8, 3};

        int solution1 = new Solution25().solution(arr1);
        int solution2 = new Solution25().solution(arr2);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}

class Solution25 {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenTmp = "";
        String oddTmp = "";

        for (int i = 0; i < num_list.length; i++) {
            evenTmp += num_list[i] % 2 == 0 ? num_list[i] : "";
            oddTmp += num_list[i] % 2 != 0 ? num_list[i] : "";
        }
        return Integer.parseInt(evenTmp) + Integer.parseInt(oddTmp);
    }
}
