package easyCondingTest;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class question47 {
    public static void main(String[] args) {
        int solution = new Solution47().solution("banana","ban");
        System.out.println("solution = " + solution);
    }
}
class Solution47 {
    public int solution(String my_string, String is_prefix) {
        String[] tmp = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            tmp[i] = my_string.substring(0,i);
        }
        for (String s : tmp) {
            if (s.equals(is_prefix)) {
                return 1;
            }
        }
        return 0;
    }
}