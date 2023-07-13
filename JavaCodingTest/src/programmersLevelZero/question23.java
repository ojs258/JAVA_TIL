package programmersLevelZero;

public class question23 {
    public static void main(String[] args) {
        int solution1 = new Solution23().solution(2, 6, 1);
        int solution2 = new Solution23().solution(5, 3, 3);
        int solution3 = new Solution23().solution(4, 4, 4);
        int solution4 = new Solution23().solution(3, 3, 5);
        int solution5 = new Solution23().solution(3, 5, 3);


        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
        System.out.println("solution4 = " + solution4);
        System.out.println("solution5 = " + solution5);
    }
}
class Solution23 {
    public int solution(int a, int b, int c) {
        int result1 = a + b + c;
        int result2 = result1 * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int result3 = result2 * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        if(a == b && b == c) {
            return result3;
        } else if (a == b || b == c || a == c) {
            return result2;
        } else {
            return result1;
        }
    }
}