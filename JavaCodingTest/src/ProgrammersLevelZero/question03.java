package ProgrammersLevelZero;

import java.util.Scanner;

public class question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열을 입력받는다.
        int n = sc.nextInt(); // 숫자를 입력받는다.

        //입력받은 숫자 만큼 입력받은 문자열을 출력한다.
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}
