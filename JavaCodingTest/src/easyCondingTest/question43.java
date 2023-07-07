package easyCondingTest;

public class question43 {
    public static void main(String[] args) {
        String solution = new Solution43().solution("ProgrammerS123",11);
        System.out.println("solution = " + solution);
    }
}
class Solution43 {
    public String solution(String my_string, int n) {

        return my_string.substring(my_string.length() - n,my_string.length());
    }
}