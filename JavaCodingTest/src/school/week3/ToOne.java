package school.week3;

public class ToOne {
    public static int solution(int n, int k){
        int cnt = 0;
        while (!(n == 1)){
            n = n % k == 0 ? n / k : n - 1;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int solution = solution(25, 5);
        System.out.println("solution = " + solution);
    }
}
