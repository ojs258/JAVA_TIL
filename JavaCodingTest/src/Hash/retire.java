package Hash;

import java.util.*;

public class retire {
    public String solution1(String[] participant, String[] completion) {
        //LinkedList와 sort로 극한의 최적화로 푼 버전
        List<String> part = new LinkedList<>(Arrays.asList(participant));
        List<String> comp = new LinkedList<>(Arrays.asList(completion));
        Collections.sort(part);
        Collections.sort(comp);
        for(String str : comp){
            part.remove(str);
        }
        return part.get(0);
    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> players = new HashMap<>();
        for (String s : participant) {
            players.put(s, players.getOrDefault(s, 0) + 1);
        }
        for (String s : completion){
            players.put(s,players.get(s)-1);
        }
        for(String str : players.keySet()){
            if(players.get(str).equals(1)){
                return str;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String solution = new retire().solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "mislav", "ana"});
        System.out.println("solution = " + solution);
    }
}
