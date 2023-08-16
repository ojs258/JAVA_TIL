package ProgrammersLevelZero;

public class question17 {
    public static void main(String[] args) {
        int solution = new Solution17().solution(60, 2, 3);
    }
}
class Solution17 {
    public int solution(int number, int n, int m) {
        return number % n == 0 ? (number % m == 0 ? 1 : 0) : 0;
        // 삼항연산자를 두 개 이용해서 number가 n의 배수이면0서 m과 공배수이면 1
        // 나머지 경우에는 0을 리턴한다.
    }
}