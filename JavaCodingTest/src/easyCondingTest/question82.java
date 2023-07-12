package easyCondingTest;

public class question82 {
    public static void main(String[] args) {
        int solution = new Solution82().solution("banana", "ana");
        System.out.println("solution = " + solution);
    }
}

class Solution82 {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0, j = pat.length(); j <= myString.length(); i++,j++) {
            answer += myString.substring(i,j)
                    .equals(pat) ? 1 : 0;
        }
        return answer;
    }
}