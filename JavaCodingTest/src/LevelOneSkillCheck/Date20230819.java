package LevelOneSkillCheck;

import java.util.Arrays;


public class Date20230819 {
    // 배열이 주어지고 평균을 구해서 리턴하는 문제
    public double solution(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }

    /*
    이번 년도 1월 1일의 요일은 금요일 이다.
    오늘은 날짜가 a월 b일 일 때 오늘의 요일을 리턴 하는 문제
    */
        public String solution(int a, int b) {
        String[] day = new String[]{"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        int cnt = 0;
        for(int i = 1; i < 13; i++) {
            for(int j = 1; j < month[i] + 1; j++) {
                if(i == a && j == b){
                    return day[cnt % 7];
                }
                cnt++;
            }
        }
        return "NULL";
    }
}
