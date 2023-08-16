package ProgrammersLevelZero;

public class question99 {
    public static void main(String[] args) {
        int[] solution = new Solution99().solution(new int[]{49, 12, 100, 276, 33}, 27);
        for (int i : solution) {
            System.out.println( i);
        }
    }
}
class Solution99 {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        if(len % 2 == 0) {
            for (int i = 1; i < len; i += 2) {
                arr[i] += n;
            }
        } else {
            for (int i = 0; i < len; i += 2) {
                arr[i] += n;
            }
        }
        return arr;
    }
}