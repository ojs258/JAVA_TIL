package kakaoBlindCodingTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

//개인정보 수집 유효기간
public class question150370 {
    public static void main(String[] args) throws ParseException {
        int[] solution = new Solution150370().solution("2022.05.19",new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
    }
}

class Solution150370 {
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy.MM.dd");
        List<Date> dates = new ArrayList<>();
        List<String[]> tmp = Arrays.stream(privacies).map(n -> n.split(" ")).collect(Collectors.toList());

        for(int i = 0; i < tmp.size(); i++) {
            dates.add(sdt.parse(tmp.get(i)[0]));
        }
        for (int i = 0; i < dates.size(); i++) {
            dates.get(i)
        }
        return new int[0];
    }
}