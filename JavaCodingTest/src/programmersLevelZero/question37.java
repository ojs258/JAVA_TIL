package programmersLevelZero;

import java.util.Arrays;

public class question37 {
    public static void main(String[] args) {

        int solution0 = new Solution37().solution(2, 2, 2, 2);
        int solution1_1 = new Solution37().solution(4, 1, 4, 4);
//        int solution1_2 = new Solution37().solution(4, 4, 1, 4);
//        int solution1_3 = new Solution37().solution(4, 4, 4, 1);
        int solution2_1 = new Solution37().solution(6, 3, 3, 6);
//        int solution2_2 = new Solution37().solution(3, 3, 6, 6);
//        int solution2_3 = new Solution37().solution(3, 6, 6, 3);
        int solution3_1 = new Solution37().solution(2, 5, 2, 6);
//        int solution3_2 = new Solution37().solution(2, 2, 5, 6);
//        int solution3_3 = new Solution37().solution(2, 5, 6, 2);
        int solution4 = new Solution37().solution(6, 4, 2, 5);


        System.out.println("solution0 = " + solution0);
        System.out.println("solution1 = " + solution1_1);
//        System.out.println("solution1 = " + solution1_2);
//        System.out.println("solution1 = " + solution1_3);
        System.out.println("solution2 = " + solution2_1);
//        System.out.println("solution2 = " + solution2_2);
//        System.out.println("solution2 = " + solution2_3);
        System.out.println("solution3 = " + solution3_1);
//        System.out.println("solution3 = " + solution3_2);
//        System.out.println("solution3 = " + solution3_3);
        System.out.println("solution4 = " + solution4);

    }
}
class Solution37 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = new int[7];
        dice[a]++;
        dice[b]++;
        dice[c]++;
        dice[d]++;
        int[] scores = {a, b, c, d};
        int[] distScores = Arrays.stream(scores).distinct().toArray();


       switch (Arrays.stream(dice).max().getAsInt()) {
           case 2: // 겹치는 숫자가 2개 {a,a,a,b} {a,a,b,b}
               int max = Arrays.stream(distScores).max().getAsInt();
               int min = Arrays.stream(distScores).min().getAsInt();
               int case2q = 0;
               int case2r = 0;
               if(distScores.length == 3){
                   for (int i = 1; i < dice.length; i++) {
                       if (case2q == 0 && dice[i] == 1) {
                           case2q = i;
                       }
                       if (case2q != 0 && dice[i] == 1) {
                           case2r = i;
                       }
                   }
                   return case2q * case2r;
               } else {
                   return (max + min) * (max - min);
               }

           case 3: // 겹치는 숫자가 3개
               int case3p = 0;
               int case3q = 0;
               for (int i = 1; i < dice.length; i++) {
                   if (dice[i] == 3) {
                       case3p = i;
                   }
                   if (dice[i] == 1) {
                       case3q = i ;
                   }
               }
               return (10 * case3p + case3q) * (10 * case3p + case3q);

           default:
               return distScores.length == 1 ? 1111 * a: Arrays.stream(new int[]{a, b, c, d}).min().getAsInt();
       }
    }
}