package easyCondingTest;

public class question20 {
    public static void main(String[] args) {
        int solution = new Solution20().solution(-4, 7, true);
    }
}
class Solution20 {
    public int solution(int a, int b, boolean flag) {
        return flag ? a+b : a-b;
        // 삼항연산자를 이용해서 flag가 참이면 a+b 거짓이면 a-b를 리턴한다.
    }
}
