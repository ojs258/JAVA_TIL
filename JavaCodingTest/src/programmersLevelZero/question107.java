package programmersLevelZero;

import java.math.BigInteger;

public class question107 {
    public static void main(String[] args) {
        String solution = new Solution07().solution("18446744073709551615", "305793246910280479981");
        System.out.println("solution = " + solution);
    }
}
class Solution07 {
    public String solution(String a, String b) {
//BigInteger의 존재를 몰랐다..
//         int[] intA = a.chars().map(n -> n - 48).toArray();
//         int[] intB = b.chars().map(n -> n - 48).toArray();
//         int minLen = Math.min(a.length(), b.length());
//         int maxLen = Math.max(a.length(), b.length());
//         int len = maxLen - minLen;
//         int[] tmp = new int[maxLen + 1];
//         String answer = new String();

//         if (maxLen == a.length()) {
//             for (int i = 0; i < minLen; i++) {
//                 tmp[i + len + 1] = intB[i];
//             }
//             for (int i = maxLen - 1; i >= 0; i--) {
//                 if (intA[i] + tmp[i + 1] >= 10) {
//                     tmp[i]++;
//                     tmp[i + 1] += intA[i] - 10;
//                 } else {
//                     tmp[i + 1] += intA[i];
//                 }
//             }
//         } else {
//             for (int i = 0; i < minLen; i++) {
//                 tmp[i + len + 1] = intA[i];
//             }
//             for (int i = maxLen - 1; i >= 0; i--) {
//                 if (intB[i] + tmp[i + 1] >= 10) {
//                     tmp[i]++;
//                     tmp[i + 1] += intB[i] - 10;
//                 } else {
//                     tmp[i + 1] += intB[i];
//                 }
//             }
//         }
//         if(tmp[0] == 0) {
//             for (int i = 1; i < tmp.length; i++) {
//                 answer += String.valueOf(tmp[i]);
//             }
//         } else {
//             for (int i = 0; i < tmp.length; i++) {
//                 answer += String.valueOf(tmp[i]);
//             }
//         }
//BigInteger의 존재를 알아버렸다...
        return new BigInteger(a).add(new BigInteger(b))+"";
    }
}