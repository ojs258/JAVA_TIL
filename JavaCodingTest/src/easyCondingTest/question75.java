package easyCondingTest;

public class question75 {
    public static void main(String[] args) {
        int solution = new Solution75().solution("AbCdEfG", "aBc");
        System.out.println("solution = " + solution);
    }
}

class Solution75 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}