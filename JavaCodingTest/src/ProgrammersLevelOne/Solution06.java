package ProgrammersLevelOne;


import java.util.*;

public class Solution06 {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> minKeys = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            minKeys.put((char)(i+65),27);
        }

        for(String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char cNode = key.charAt(i);
                minKeys.put(cNode,Math.min(minKeys.get(cNode),i+1));
            }
        }

        for (String target : targets) {
            int sum = 0;
            for(char ch : target.toCharArray()) {
                if(minKeys.get(ch) > 100){
                    break;
                }
                sum += minKeys.get(ch);
            }
            answer.add(sum == 0 ? -1 : sum);
        }
        return answer.stream().mapToInt(n -> n).toArray();
    }
    public static void main(String[] args) {
        int[] solution = new Solution06().solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA", "BGZ"});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
