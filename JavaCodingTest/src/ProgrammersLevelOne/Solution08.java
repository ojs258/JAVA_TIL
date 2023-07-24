package ProgrammersLevelOne;

import java.util.*;

public class Solution08 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<String> skipStr = new ArrayList<>();

        for(char ch : skip.toCharArray()) {
            skipStr.add(String.valueOf(ch));
        }

        for(char str : s.toCharArray()) {
            // 총 인덱스 수 만큼 증가하는지 체크하는 count
            int cnt = 0;
            while(cnt < index){
                //현재 비교중인 문자열 +1
                str++;
                //아스키코드 122 'z'를 넘어가면 97 'a'로 돌아오게 하는 코드
                str = str == 123 ? 97 : str;
                // 이번 문자열이 skip문자열에 포함되는지 확인후 거짓이면 cnt + 1
                if(!skipStr.contains(String.valueOf(str))){
                    cnt++;
                }
            }
            answer += String.valueOf(str);
        }
        return answer;
    }
}
