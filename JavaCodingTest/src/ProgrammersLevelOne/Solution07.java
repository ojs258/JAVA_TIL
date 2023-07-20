package ProgrammersLevelOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Solution07 {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            //이름을 Key로 그리움 점수를 저장
            HashMap<String, Integer> yearnings = new HashMap<>();
            List<Integer> answer = new ArrayList();
            for (int i = 0; i < name.length; i++) {
                yearnings.put(name[i], yearning[i]);
            }

            // 각 사진별 사람들의 그리움 점수의 총합을 리스트에 add()함
            // 단, Key = 그리움 점수를 가진 사람 이름에 해당하지 않는 이름이 들어오면 무시
            for (String[] pho : photo) {
                int sum = 0;
                for (String people : pho) {
                    if (yearnings.containsKey(people)) {
                        sum += yearnings.get(people);
                    }
                }
                answer.add(sum);
            }
            // 리턴 타입을 맞춰서 리턴
            return answer.stream().mapToInt(n -> n).toArray();
        }
}
