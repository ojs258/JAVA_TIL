package easyCondingTest;

public class question81 {
    public static void main(String[] args) {
        String solution = new Solution81().solution("AbCdEFG", "dE");
        System.out.println("solution = " + solution);
    }
}

class Solution81 {
    public String solution(String myString, String pat) {
        for (int i = myString.length(); i > 0; i--) {
            if (myString.substring(i-pat.length(),i).equals(pat)){
                return myString.substring(0,i);
            }
        }
        return "";
    }
}