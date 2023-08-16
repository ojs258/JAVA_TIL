package ProgrammersLevelZero;

import java.util.Arrays;

public class question63 {
    public static void main(String[] args) {
        String[] solution1 = new Solution63().solution(new String[]{"u","u","l","u","u","u"});
        String[] solution2 = new Solution63().solution(new String[]{"u","u","r","u","u","u"});
        String[] solution3 = new Solution63().solution(new String[]{});
        String[] solution4 = new Solution63().solution(new String[]{"l"});

        for (String s : solution4) {
            System.out.println("s = " + s);
        }
    }
}

class Solution63 {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            switch (str_list[i]){
                case "l":
                    return Arrays.copyOfRange(str_list,0,i);
                case "r":
                    return Arrays.copyOfRange(str_list,i+1,str_list.length);
            }
        }
        return answer;
    }
}