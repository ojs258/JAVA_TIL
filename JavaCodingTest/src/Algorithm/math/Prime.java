package Algorithm.math;

public class Prime {
    // 제곱근을 이용한 방법
    // i = 2 부터 i의 제곱이 num 보다 작거나 같을때 까지 탐색하는데
    // num의 제곱근 보다 큰 수는 비교해보지 않아도 나누어 떨어질 수 없다는 점을 이용했다.
    public boolean isPrime(int num){
        if(num < 2) {
            return false;
        } else {
            for(int i = 2; (int)Math.pow(i,2) <= num; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
