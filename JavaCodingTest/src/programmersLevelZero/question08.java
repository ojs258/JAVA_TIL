package programmersLevelZero;

import java.util.Scanner;

public class question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 문자열을 입력받아 변수에 저장한다.

        //for each문을 이용해 char형 배열로 형 변환한 문자열을 한 글자씩 출력해준다.
        for(char ans : a.toCharArray()) {
            System.out.println(ans);
        }
    }
}
