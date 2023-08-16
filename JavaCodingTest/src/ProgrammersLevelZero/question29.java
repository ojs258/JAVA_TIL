package ProgrammersLevelZero;

public class question29 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        int[][] queries = new int[][]{{0, 3}, {1, 2}, {1, 4}};

        int[] solution = new Solution29().solution(arr, queries);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution29 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        return arr;
    }
}

