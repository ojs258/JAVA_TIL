package ProgrammersLevelOne;

import java.util.HashMap;

public class Solution03 {
    public int[] solution(String[] park, String[] routes) {
        int[] dx={1,-1,0,0}; //동 0, 서 2, 남 1, 북 2
        int[] dy={0,0,1,-1};

        // 방향전환을 해시맵으로 저장 key로 "E"가 호출되면 arrow = 0
        // dx[arrow],dy[arrow] => 동쪽
        HashMap<String, Integer> directions = new HashMap<>();
        directions.put("E",0);
        directions.put("W",1);
        directions.put("S",2);
        directions.put("N",3);

        // 시작 지점인 'S'를 찾아 좌표를 지정
        // 찾으면 바로 break;
        int x = 0;
        int y = 0;

        findStart :
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if(park[i].toCharArray()[j] == 'S') {
                    x = j;
                    y = i;
                    break findStart;
                }
            }
        }


        // 공원의 최대 X,Y
        int mapX = park[0].length();
        int mapY = park.length;

        for (String route : routes) {
            String[] direction = route.split(" ");

            // 다음좌표를 가르키는 nx, ny가 시작좌표를 가지고 시작하도록 함
            // 이전 방향과 거리가 이동 불가능 이었다면 nx, ny를 현재 좌표로 초기화
            int nx = x;
            int ny = y;

            int arrow = directions.get(direction[0]);
            boolean cond = true;
            for (int i = 0; i < Integer.parseInt(direction[1]); i++) {
                nx += dx[arrow];
                ny += dy[arrow];

                if(nx < 0 || nx >= mapX || ny < 0 || ny >= mapY || park[ny].toCharArray()[nx] == 'X') {
                    // 공원 밖으로 벗어나거나 장애물이 있는 루트의 경우 무시
                    cond = false;
                }
            }
            if (cond) {
                // 검사를 통과했다면 실제 좌표에 적용
                x = nx;
                y = ny;
            }
        }
        return new int[]{y,x};
    }
}
