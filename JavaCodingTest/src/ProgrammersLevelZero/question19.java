package ProgrammersLevelZero;

public class question19 {
    public static void main(String[] args) {
        int solution = new Solution19().solution("<", "=", 20, 50);
    }
}
class Solution19 {
    public int solution(String ineq, String eq, int n, int m) {
        /*
        * 파라미터로 넘어온 두 개의 문자열을 더해서 하나의 비교연산자 처럼 만들고
        * switch, case, default문과 삼항연산자를 이용해서
        * 각 문자열에 맞는 비교연산자로 비교하고 참이면 1 거짓이면 0을 리턴한다.
        * */
        switch (ineq + eq) {
            case "<=":
                return n <= m ? 1 : 0;
            case ">=":
                return n >= m ? 1 : 0;
            case "<!":
                return n < m ? 1 : 0;
            case ">!":
                return n > m ? 1 : 0;
            default:
                return 0;
        }
    }
}