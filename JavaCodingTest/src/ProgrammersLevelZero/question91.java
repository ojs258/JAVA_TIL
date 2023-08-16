package ProgrammersLevelZero;

import java.util.ArrayList;

public class question91 {
    public static void main(String[] args) {
        String[] solution = new Solution91().solution("abaccca");

        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
class Solution91 {
    public String[] solution(String myStr) {
        char[] tmp = myStr.toCharArray();
        ArrayList<String> answer = new ArrayList<>();
        String tmpStr = "";
        for(int i = 0; i < myStr.length(); i++) {
            if (tmp[i]!='a'&&tmp[i]!='b'&&tmp[i]!='c') {
                tmpStr += tmp[i];
            } else if(tmpStr != ""){
                answer.add(tmpStr);
                tmpStr = "";
            }
        }
        answer.add(tmpStr);

        return answer.stream().toArray(String[]::new)[0]  == "" ? new String[]{"EMPTY"}: answer.stream().toArray(String[]::new);
    }
}