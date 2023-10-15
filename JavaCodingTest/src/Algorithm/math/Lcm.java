package Algorithm.math;

public class Lcm {
    public int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a%b);
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(b, a%b);
        // 자바는 int형끼리 나누면 자동으로 몫 나눗셈 결과가 나온다.
    }
}
