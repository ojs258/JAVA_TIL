package ProgrammersLevelZero;

public class question114 {
    public static void main(String[] args) {
        int solution = new Solution014().solution(3,5);
        System.out.println("solution = " + solution);
    }
}

class Solution014 {
    public int solution(int a, int b) {
        switch((a % 2) + (b % 2)){
            case 0:
                return a > b ? a - b : b - a;
            case 1:
                return 2*(a+b);
            case 2:
                return (a * a) + (b * b);
        }
        return 0;
    }
}