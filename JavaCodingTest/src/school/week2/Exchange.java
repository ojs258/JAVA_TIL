package school.week2;

public class Exchange {
    public static int solution(int price) {
        int[] coins = new int[]{500,100,50,10};
        int cnt = 0;
        for (int coin : coins) {
            cnt += price/coin;
            price %= coin;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int solution = solution(800);
        System.out.println("solution = " + solution);
    }
}
