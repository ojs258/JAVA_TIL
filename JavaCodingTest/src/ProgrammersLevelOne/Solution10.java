package ProgrammersLevelOne;

import java.util.HashMap;

public class Solution10 {
    public int[] solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        // 오른쪽에서 부터 문자열을 탐색
        for(int i = 0; i < s.length(); i++){
            char ch = s.toCharArray()[i];
            // 해당하는 문자가 있으면
            // 현재 인덱스 i - 이전에 등장했던 인덱스 = 가장가까운거리
            // 공식을 이용해 가장 가까운 거리를 배열에 삽입
            if(map.containsKey(ch)){
                answer[i] = i - map.get(ch);
                map.put(ch,i);
            // 해당 하는 문자가 없으면 -1을 배열에 삽입
            }else{
                answer[i] = -1;
                map.put(ch,i);
            }
        }
        //배열을 리턴
        return answer;
    }
}
