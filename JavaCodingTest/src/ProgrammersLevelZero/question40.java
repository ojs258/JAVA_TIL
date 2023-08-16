package ProgrammersLevelZero;

public class question40 {
    public static void main(String[] args) {
        String solution = new Solution40().solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}});
        System.out.println("solution = " + solution);
    }
}

class Solution40 {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for (int i = 0; i < queries.length; i++) {
            String subStr = answer.substring(queries[i][0], queries[i][1] + 1);
            String reStr = new StringBuilder(subStr).reverse().toString();
            char[] tmpArr = answer.toCharArray();
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                tmpArr[j] = reStr.charAt(j - queries[i][0]);
            }
            answer = String.valueOf(tmpArr);
        }
        return answer;
    }
}