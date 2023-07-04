// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


    }
}

class Solution55{
    public int solution(String ineq, String eq, int n, int m) {
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