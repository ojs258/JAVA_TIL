package easyCondingTest;

public class question70 {
    public static void main(String[] args) {
        int[] solution = new Solution70().solution(new int[] {0,1,2,3,4}, new int[][]{{0,1},{1,2},{2,3}});

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
class Solution70 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}