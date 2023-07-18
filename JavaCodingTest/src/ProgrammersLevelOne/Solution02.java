package ProgrammersLevelOne;

import java.util.HashMap;

// 178871 달리기 경주
// https://school.programmers.co.kr/learn/courses/30/lessons/178871
class Solution02 {
    public String[] solution(String[] players, String[] callings) {
        // 정렬된 순위를 key로 이름을 끼워맞추는 해시맵
        HashMap<Integer, String> playerRank = new HashMap<>();
        // 이름을 key로 순위정보를 저장하는 해시맵
        HashMap<String, Integer> runningPlayer = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerRank.put(i+1, players[i]);
            runningPlayer.put(players[i], i+1);
        }

        for(String call : callings) {
            // 해설자가 부를 예정인 선수의 순위를 가져옴
            Integer callRank = runningPlayer.get(call);

            // 그 순위보다 한 칸 앞서있는 선수의 순위를 가져옴
            String frontPlayer = playerRank.get(callRank-1);

            // 두 선수의 위치를 교환
            playerRank.put(callRank, frontPlayer);
            playerRank.put(callRank-1, call);

            // 두 선수의 순위 정보를 교환
            runningPlayer.put(call, callRank-1);
            runningPlayer.put(frontPlayer, callRank);
        }

        // 리턴 타입으로 변환
        String[] answer = playerRank.values().toArray(String[]::new);
        return answer;
    }

//    public static void main(String[] args) {
//        String[] solution = new Solution02().solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});
//        for (String s : solution) {
//            System.out.println(s);
//        }
//    }
}