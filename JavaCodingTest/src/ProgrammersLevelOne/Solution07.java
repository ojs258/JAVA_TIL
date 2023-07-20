package ProgrammersLevelOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class Solution07 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cntOne = 0;
        int cntTwo = 0;

        for (int i = 0; i < goal.length; i++) {
            if (goal[i] == cards1[cntOne]) {
                cntOne++;
            } else if(goal[i] == cards2[cntTwo]) {
                cntTwo++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {

        String[] strings = {"asdf", "asdfadfz"};
        List<String> strings1 = new ArrayList<>();

        strings1.addAll(Arrays.stream(strings).toList());

        HashMap<String, String> map = new HashMap<>();

        map.entrySet()

    }
}
