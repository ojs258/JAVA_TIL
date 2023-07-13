package programmersLevelZero;

public class question27 {
    public static void main(String[] args) {
        new Solution27().solution(0, "wsdawsdassw");
    }
}

class Solution27{
    public int solution(int n, String control) {
        for (char arrow : control.toCharArray()) {
            switch (arrow){
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}
