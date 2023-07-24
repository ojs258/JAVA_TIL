package kakao2023BlindCodingTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

//개인정보 수집 유효기간
public class privacyDateSolution1 {
    public static void main(String[] args) throws ParseException {
        int[] solution = new Solution1503701().solution("2020.01.01",new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"});

        for (int i : solution) {
            System.out.println(i);
        }
        LocalDate date = LocalDate.parse("2020.01.01");
    }
}

class Solution1503701 {
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        //리턴용 리스트
        List<Integer> tmp = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        // 배열 정리
        String[][] sTerms = Arrays.stream(terms).map(str -> str.split(" ")).toArray(String[][]::new);
        String[][] sPrivacies = Arrays.stream(privacies).map(str -> str.split(" ")).toArray(String[][]::new);

        String[] endDate = new String[sPrivacies.length];
        for(int i = 0; i < sPrivacies.length; i++) {
            for (int j = 0; j < sTerms.length; j++) {
                if (sPrivacies[i][1].equals(sTerms[j][0])) {
                    sPrivacies[i][1] = sTerms[j][1];
                }
            }
        }

        // 날짜 계산
        for (int i = 0; i < sPrivacies.length; i++) {
            endDate[i] = dateCalc(sPrivacies[i][0], Integer.parseInt(sPrivacies[i][1]));
        }

        // 날짜 비교
        for (String s : endDate) {
            tmp.add(dateCompare(s,today));
        }
        // 리턴
        for(int i = 0; i < tmp.size(); i++) {
            if (tmp.get(i) == 1) {
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }

    String dateCalc(String sDate, int addDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        Calendar cal = Calendar.getInstance();

        Date date = sdf.parse(sDate);

        cal.setTime(date);

        cal.add(Calendar.MONTH,addDate);
        int checkLastDate = cal.get(Calendar.DATE);
        if(checkLastDate == 30 || checkLastDate == 31){
            cal.set(Calendar.DATE,28);
        }

        return sdf.format(cal.getTime());
    }

    int dateCompare(String compareDate, String today) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        Calendar cal = Calendar.getInstance();

        Date dateA = sdf.parse(compareDate);
        Date dateB = sdf.parse(today);


        return dateB.compareTo(dateA);

    }
}