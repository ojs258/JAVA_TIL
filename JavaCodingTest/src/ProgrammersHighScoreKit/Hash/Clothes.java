package ProgrammersHighScoreKit.Hash;

import java.util.HashMap;
import java.util.Map;

public class Clothes {
    public int solution(String[][] clothes) {
        Map<String, Integer> cloMap = new HashMap<>();
        int answer = 1;

        // Map에 각 부위별 의상의 개수를 저장 한다.
        // 이 때 defaultValue가 1인 이유는 해당 부위에 아무 것도 착용하지 않는 경우의 수도 포함 시키기 때문.
        // ex) 안경 2종류, 상의 1종류를 모두 조합에 입는 경우의 수는 3 * 2 = 6이다.
        //      하지만 6개의 경우의 수 중에서 안경, 상의를 둘다 착용하지 않는다 라는 경우의 수 1을 빼면
        //      정답 5가 나온다.
        //      안경 미착용 + 상의 미착용   X
        //      안경 1 + 상의 미착용       O
        //      안경 2 + 상의 미착용       O
        //      상의 1 + 안경 미착용       O
        //      안경 1 + 상의 1           O
        //      안경 2 + 상의 1           O
        //      총 다섯개
        for(String[] arr : clothes){
            cloMap.put(arr[1],cloMap.getOrDefault(arr[1],1)+1);
        }

        // 위의 내용을 식으로 쓰면
        // a = 안경 종류 수 + 1, b = 상의 종류 수 + 1
        // c = 모든 조합의 수(a * b)

        for(Integer num : cloMap.values()){
            answer *= num;
        }
        // answer = c - 1 (아무것도 착용하지 않는 경우 1을 뺀다.)
        return answer - 1;
    }
}