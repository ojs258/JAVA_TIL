package ProgrammersLevelOne;

import java.util.HashMap;

class Solution02 {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> callingMap = new HashMap<>();

        for (String calling : callings) {
            callingMap.put(calling, 1);
        }
        for (String s : callingMap.keySet()) {
            System.out.println(callingMap.get(s));
        }

        return new String[]{""};
    }

    public static void main(String[] args) {
        String[] solution = new Solution02().solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});
        for (String s : solution) {
            System.out.println(s);
        }
    }
}