package programmersLevelZero;

public class question48 {
    public static void main(String[] args) {
        String solution = new Solution48().solution("Progra21Sremm3",6,12);

        System.out.println("solution = " + solution);
    }
}
class Solution48 {
    public String solution(String my_string, int s, int e) {
        char[] answer = my_string.toCharArray();
        char[] rStr = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString().toCharArray();

        for (int i = 0; i < rStr.length; i++) {
            answer[i+s] = rStr[i];
        }
        return String.valueOf(answer);
    }
}