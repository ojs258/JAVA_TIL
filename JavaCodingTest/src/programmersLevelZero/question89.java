package programmersLevelZero;

public class question89 {
    public static void main(String[] args) {
        int solution = new Solution89().solution("ABBAA","AABB");

        System.out.println("solution = " + solution);
    }
}
class Solution89 {
    public int solution(String myString, String pat) {
        char[] tmp = myString.toCharArray();
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            answer += tmp[i] == 'A' ? 'B' : 'A';
        }

        return answer.contains(pat) ? 1 : 0;
    }
}