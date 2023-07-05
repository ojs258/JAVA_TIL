package easyCondingTest;

public class question31 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 4, 3};
        int[][] queries = new int[][]{{0, 4, 1},{0, 3, 2},{0, 3, 3}};
        int[] solution = new Solution31().solution(arr, queries);

        for (int i : solution) {
            System.out.println(i);
        }
    }
}

class Solution31 {
    public int[] solution(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(j % queries[i][2] == 0) {
                    arr[j] += 1;
                }
            }
        }
        return arr;
    }
}