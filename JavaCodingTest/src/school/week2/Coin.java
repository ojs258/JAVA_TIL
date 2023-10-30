package school.week2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Coin {
    public static int solution(int coinCnt, int price) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> coins = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < coinCnt; i++) {
            coins.add(scan.nextInt());
        }
        coins.sort(Comparator.reverseOrder());
        for (Integer coin : coins) {
            if (coin < price) {
                while (!(price < coin)) {
                    price -= coin;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int solution = solution(10, 4200);
        System.out.println("solution = " + solution);
    }
}
