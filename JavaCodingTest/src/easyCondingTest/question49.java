package easyCondingTest;

public class question49 {
    public static void main(String[] args) {
        String solution = new Solution49().solution("ihrhbakrfpndopljhygc", 4,2);

        System.out.println("solution = " + solution);
    }
}

class Solution49 {
    public String solution(String my_string, int m, int c) {
        int len = my_string.length()/ m;
        String answer = new String();
        char[][] tmp = new char[len][m];
        for (int i = 0; i < len; i++) {
            char[] subStr = my_string.substring(i * m, m * (i + 1)).toCharArray();// 0~m, m~m*2, m*2~m*3...
            for (int j = 0; j < m; j++) {
                tmp[i][j] = subStr[j];
            }
        }
        for (int i = 0; i < len; i++) {
            answer += tmp[i][c - 1];
        }
        return String.valueOf(answer);
    }
}