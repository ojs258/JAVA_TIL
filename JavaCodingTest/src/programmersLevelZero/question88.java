package programmersLevelZero;

public class question88 {
    public static void main(String[] args) {
        int solution = new Solution88().solution("0 - 7777");

        System.out.println("solution = " + solution);
    }
}
class Solution88 {
    public int solution(String binomial) {
        String[] tmp = binomial.split(" ");

        switch(tmp[1]) {
            case "+":
                return Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]);
            case "-":
                return Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);
            case "*":
                return Integer.parseInt(tmp[0]) * Integer.parseInt(tmp[2]);
        }
        return 1;
    }
}