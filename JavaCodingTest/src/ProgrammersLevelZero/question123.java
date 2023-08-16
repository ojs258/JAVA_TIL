package ProgrammersLevelZero;

public class question123 {
    public static void main(String[] args) {
        int[][] solution = new Solution023().solution(new int[][]{{572, 22, 37},{287, 726, 384},{85, 137, 292},{487, 13, 876}});

        for (int[] ints : solution) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
class Solution023 {
    public int[][] solution(int[][] arr) {
        int len = Math.max(arr.length,arr[0].length);
        int[][] answer = new int[len][len];
        for (int i = 0; i < arr.length; i++){
            System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        }
        return answer;
    }
}