package programmersLevelZero;

public class question30 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 4, 3};
        int[][] queries = new int[][]{{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        int[] solution = new Solution30().solution(arr, queries);

        for (int i : solution) {
            System.out.println(i);
        }
    }
}
class Solution30 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] tmp = new int[queries.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = 1000001;
        }
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2]) {
                    tmp[i] = Math.min(tmp[i], arr[j]);
                }
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = tmp[i] == 1000001 ? -1 : tmp[i];
        }
        return tmp;
    }
}