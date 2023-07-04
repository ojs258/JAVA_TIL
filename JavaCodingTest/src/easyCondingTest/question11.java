package easyCondingTest;

public class question11 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        System.out.println("solution11 = " + solution11.solution("aaaaa", "bbbbb"));
    }
}

class Solution11 {
    public String solution(String str1, String str2) {
        String answer = "";
        //파라미터로 받은 문자열을 char 배열로 만들어줍니다.
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.toCharArray()[i];
            answer += str2.toCharArray()[i];
        } // 번갈아가며 answer변수에 저장해줍니다.
        return answer;
    }
}