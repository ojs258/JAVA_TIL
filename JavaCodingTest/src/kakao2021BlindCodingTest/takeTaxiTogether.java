package kakao2021BlindCodingTest;

import java.util.*;
public class takeTaxiTogether {
    int[][] routes;
    public int solution(int n, int s, int a, int b, int[][] fares) {
        routes = new int[n+1][n+1];

        for (int i = 0; i < fares.length; i++) {
            routes[fares[i][0]][fares[i][1]] = fares[i][2];
            routes[fares[i][1]][fares[i][0]] = fares[i][2];
        }

        for (int[] route : routes) {
            for (int i : route) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        return 0;
    }

    public int shortCut() {
        return 0;
    }
    public static void main(String[] args) {
        int solution = new takeTaxiTogether().solution(6, 4, 6, 2, new int[][]{{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}});

    }
}
