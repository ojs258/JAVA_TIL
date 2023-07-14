package programmersLevelZero;

import java.util.Collection;
import java.util.HashMap;

public class question102 {
    public static void main(String[] args) {
        int solution = new Solution02().solution(new int[]{20,5,3,7,5,80}, new boolean[]{true, false, true, false, false, true});
        System.out.println("solution = " + solution);
    }
}

class Solution02 {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> tmp = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]){
                tmp.put(rank[i],i);
            }
        }
        int[] array = tmp.keySet().stream().mapToInt(n -> n).sorted().toArray();
        return tmp.get(array[0]) * 10000 + tmp.get(array[1]) * 100 + tmp.get(array[2]);
    }
}