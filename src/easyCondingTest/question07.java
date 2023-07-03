package easyCondingTest;

import java.util.Scanner;

public class question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        //문자열 두개를 입력받아 변수에 저장한다.

        System.out.println(a.concat(b));
        // concat() 메서드를 이용해 두 문자열을 합쳐준다.
    }
}
