package ProgrammersLevelZero;

import java.util.Scanner;

public class question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] tmp = a.toCharArray(); // 입력받은 String을 Char형 배열로 형 변환 해준다.

        // 베열을 for each문을 이용해 요소 하나하나를 판단해 대소문자를 변경해 출력해준다.
        for (char c : tmp) {
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}
