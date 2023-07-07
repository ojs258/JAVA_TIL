package easyCondingTest;

public class question42 {
    public static void main(String[] args) {
        String solution = new Solution42().solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"},
                new int[][]{{0,4},{1,2},{3,5},{7,7}});
        System.out.println("solution = " + solution);
    }


}

class Solution42 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < parts.length; i++) {
            answer += my_strings[i].substring(parts[i][0],parts[i][1] + 1);
        }
        return answer;
    }
}