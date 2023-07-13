package programmersLevelZero;
public class question90 {
    public static void main(String[] args) {
        String solution = new Solution90().solution("masterpiece");

        System.out.println("solution = " + solution);
    }
}
class Solution90 {
    public String solution(String rny_string) {
        return rny_string.replace("m","rn");
    }
}