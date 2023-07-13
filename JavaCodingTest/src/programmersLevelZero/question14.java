package programmersLevelZero;

public class question14 {

    public static void main(String[] args) {
        System.out.println(new Solution14().solution(8,6));
    }
}

class Solution14 {
    public int solution(int a, int b) {
        // 파라미터로 넘어온 a,b를 형 변환해서 concat메서드로 두 가지 순서로 이어붙힙니다.
        int tmpA = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int tmpB = Integer.parseInt(String.valueOf(b).concat(String.valueOf(a)));
        int answer = tmpA > tmpB ? tmpA : tmpB;
        // 삼항연산자를 이용해 변수 중 큰 변수를 answer에 저장해줍니다.
        return answer;
    }
}