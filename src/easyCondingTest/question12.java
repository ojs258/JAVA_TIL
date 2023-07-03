package easyCondingTest;

public class question12 {
    public static void main(String[] args) {
        System.out.println(new Solution12().solution(new String[]{"a", "b", "c"}));
    }
}

class Solution12 {
    public String solution(String[] arr) {
        String answer = "";
        //파라미터로 받아온 배열을 for each문을 이용해 answer변수에 이어붙혀서 저장해준다.
        for (String s : arr) {
            answer += s;
        }
        return answer;
    }
}