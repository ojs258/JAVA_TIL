package programmersLevelZero;

public class question111 {
    public static void main(String[] args) {
        int solution = new Solution011().solution("abc", "aabcc");
        System.out.println("solution = " + solution);
    }
}
class Solution011 {
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}