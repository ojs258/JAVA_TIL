package ProgrammersLevelZero;

import java.util.Scanner;

public class question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 숫자를 입력받아 int형 변수에 저장한다.

        if(n%2==0){
            System.out.println(n+" is even");
        }else {
            System.out.println(n+" is odd");
        } // 입력받은 변수를 2로 나눈 나머지가 0이면 짝수 0이아니면 홀수라는 뜻의
          // is even과 is odd로 출력해준다.
    }
}
