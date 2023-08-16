package ProgrammersLevelZero;

public class question104 {
    public static void main(String[] args) {
        int solution = new Solution04().solution("12345678954");

        System.out.println("solution = " + solution);
    }
}

class Solution04 {
    public int solution(String num_str) {
        return num_str.chars().map(c -> c - 48).sum();
        //String을 IntStream으로 chars()
    }
}