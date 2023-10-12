package Algorithm.math;

public class Gcd {
    // 기본적인 방법
    public int gcd1(int a, int b) {
        int size = Math.min(a,b);
        for(int i = size; i > 0; i--) {
            if(a % i == 0 && b % i == 0) return i;
        }
        return 1;
    }

// 유클리드 호제법 - 반복문을 이용한 방법
    public int gcd2(int a, int b) {
        while(a%b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return b;
    }

// 유클리드 호제법 - 재귀를 이용한 방법
    public int gcd3(int a, int b) {
        if (a % b == 0) return b;
        return gcd3(b, a%b);
    }
}
