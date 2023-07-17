package kakaoBlindCodingTest;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class privateDateSolution2 {
    public static void main(String[] args) throws ParseException {
        int[] solution = new Solution1503702().solution("2020.01.01",new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"});

        for (int i : solution) {
            System.out.println(i);
        }
    }
}
class Solution1503702 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, String> termMaps = new HashMap<>();
        int[] privates = new int[privacies.length];
        List<Integer> answer = new ArrayList<>();

        for (String str : terms) {
            String[] term = str.split(" ");
            termMaps.put(term[0],term[1]);
        } // terms를 map으로 바꿔서  key:value형식으로 참초 할 수 있게 함.

        int condDate = dateForm(today);
        for (int i = 0; i < privates.length; i++) {
            String[] privacy = privacies[i].split(" ");
            int addDate = 0;
            addDate = Integer.parseInt(termMaps.get(privacy[1]))*28;
            if(dateForm(privacy[0]) + addDate -1 < condDate){
                answer.add(i+1);
            }
        } // 비교 대상인 날짜도 28일 체계로 바꿔서 비교

        return answer.stream().mapToInt(n -> n).toArray();
    }

    private int dateForm(String date) {
        String[] sdate = date.split("\\.");

        int y = Integer.parseInt(sdate[0]); // YEAR
        int m = Integer.parseInt(sdate[1]); // MONTH
        int d = Integer.parseInt(sdate[2]); // DATE

        return y * 12 * 28 + m *28 + d;
    } // 날짜 체계 자체를 바꿔서 한달을 28일로 고정하고 day로 바꿔서 리턴
}