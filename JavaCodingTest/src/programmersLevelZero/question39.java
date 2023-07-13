package programmersLevelZero;

public class question39 {
    public static void main(String[] args) {
        int solution = new Solution39().solution("78720646226947352489");
        System.out.println(solution);
    }
}
class Solution39 {
    public int solution(String number) {
        int answer = 0;
        try {

            return Integer.parseInt(number) % 9;

        } catch (NumberFormatException e) {

            for (char c :number.toCharArray()){
                answer += (int)c - '0'; //
            }
            return answer % 9;

        }
    }
}