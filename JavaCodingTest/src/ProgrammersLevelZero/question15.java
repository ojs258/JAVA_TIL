package ProgrammersLevelZero;

public class question15 {
    public static void main(String[] args) {
        System.out.println(new Solution15().solution(5,9));
    }
}

class Solution15 {
    public int solution(int a, int b) {
        // 파라미터로 넘어온 두 변수를 이어붙이거나 두 변수와 숫자 2를 곱합니다.
        int tmpA = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int tmpB = 2*a*b;
        return tmpA > tmpB ? tmpA : tmpB;
        // 삼항연산자를 이용해 둘 중 더 큰 값을 리턴합니다.
    }
}