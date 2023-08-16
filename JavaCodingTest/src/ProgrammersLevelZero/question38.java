package ProgrammersLevelZero;

public class question38 {
    public static void main(String[] args) {
        String solution = new Solution38().solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7});

        System.out.println("solution = " + solution);
    }
}

class Solution38 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int i : index_list) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}