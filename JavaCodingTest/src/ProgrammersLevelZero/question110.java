package ProgrammersLevelZero;

public class question110 {
    public static void main(String[] args) {
        int solution = new Solution010().solution("banana","ana");
        System.out.println("solution = " + solution);
    }
}
class Solution010 {
    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}