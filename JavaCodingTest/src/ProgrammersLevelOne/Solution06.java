package ProgrammersLevelOne;


import java.util.*;

public class Solution06 {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> minKeys = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            minKeys.put((char)(i+65),0);
        }// 휴대폰 자판의 형태를 해시맵을 구성

        for(String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char cNode = key.charAt(i);
                int nodeNum = minKeys.get(cNode);
                minKeys.put(cNode,Math.min(nodeNum == 0 ? i + 1 : nodeNum,i+1));
            }
        } // Math.min(nodeNum == 0 ? i + 1 : nodeNum,i+1)
          // 위의 조건으로 최적화된 휴대폰 자판을 만든다.


        for (String target : targets) {
            int sum = 0;
            for(char ch : target.toCharArray()) {
                if(minKeys.get(ch) == 0){
                    sum = -1;
                    break;
                }
                sum += minKeys.get(ch);
                // 눌린 버튼 수 총합
            }
            answer.add(sum);
            // 각 목표 문자열의 눌린 버튼 수 리스트로 조합
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }
}
