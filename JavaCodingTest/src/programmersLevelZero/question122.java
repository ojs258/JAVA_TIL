package programmersLevelZero;

public class question122 {
    public static void main(String[] args) {
        int solution = new Solution022().solution(new int[][]{{5, 192, 33},{192, 72, 95},{33, 95, 999}});
        System.out.println("solution = " + solution);
    }
}

class Solution022 {
    public int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if(arr[i][j] != arr[j][i]) return 0;
            }
        }
        return 1;
    }
}