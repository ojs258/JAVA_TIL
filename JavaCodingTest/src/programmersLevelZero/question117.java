package programmersLevelZero;

import java.util.ArrayList;

public class question117 {
    public static void main(String[] args) {
        String[] solution = new Solution017().solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."},2);
        for (String s : solution) {
            System.out.println(s);
        }
    }
}

class Solution017 {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            String tmp = "";
            char[] pic = picture[i].toCharArray();
            for(int n = 0; n < pic.length; n++){
                for(int m = 0; m < k; m++){
                    tmp += String.valueOf(pic[n]);
                }
            }
            for (int j = 0; j < k; j ++){
                answer.add(tmp);
            }
        }
        return answer.stream().toArray(String[]::new);
    }
}