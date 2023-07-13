package programmersLevelZero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question91 {
    public static void main(String[] args) {

    }
}
class Solution {
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

        return answer.stream().toArray(String[]::new)[0]  == "" ? ;
    }
}