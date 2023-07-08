package easyCondingTest;

public class question46 {
    public static void main(String[] args) {
        String solution = new Solution46().solution("ProgrammerS123",11);
        System.out.println("solution = " + solution);
    }
}

class Solution46 {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}