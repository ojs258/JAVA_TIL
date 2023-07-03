package easyCondingTest;

public class question16 {
    public static void main(String[] args) {
        int solution = new Solution16().solution(98, 2);
    }
}
class Solution16 {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
        // 삼항연산자를 이용해 num을 n으로 나눈 나머지가 0이면 배수이므로
        // 1을 리턴 0이 아니면 배수가 아니므로 0을 리턴
    }
}