package ProgrammersLevelOne;

public class Solution15 {
    public String solution(int[] food) {
        String answer = "";
        String tmp = "";
        for(int i = 1; i < food.length; i++){
            int cnt = food[i];
            // 배열에 저장된 음식의 개수가 짝수면 몫을 홀수면 음식의 개수 - 1한 뒤의 몫을 리턴
            int len = cnt % 2 == 0 ? cnt / 2 : (cnt - 1) / 2;
            // 위의 흐름을 통해 한 명이 먹을 음식을 쭉 나열한다.
            for(int j = 0; j < len; j++){
                tmp += i ;
            }
        }
        // 스트링 빌더를 통해 한명이 먹을 음식목록을 반대로 뒤집으면
        // 나머지 한명이 먹을 음식이 목록이 된다.
        StringBuilder sb = new StringBuilder(tmp);

        // 두 음식 목록을 0을 기준으로 나눠지게 합쳐서 리턴.
        return tmp + "0" + sb.reverse();
    }
}
