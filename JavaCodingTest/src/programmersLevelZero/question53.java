package programmersLevelZero;

public class question53 {
    public static void main(String[] args) {
        String solution = new Solution53().solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3});

        System.out.println("solution = " + solution);
    }
}
class Solution53 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] tmp =  my_string.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = ' ';
        }
        return String.valueOf(tmp).replace(" ","");
    }
}