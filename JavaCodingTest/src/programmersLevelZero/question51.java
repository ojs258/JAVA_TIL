package programmersLevelZero;

public class question51 {
    public static void main(String[] args) {
        int[] solution = new Solution51().solution("Programmers");

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
class Solution51 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int[] alphabet = new int[]
                {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


        for (char c : my_string.toCharArray()) {
            for (int i = 0; i < alphabet.length; i++) {
                if ((int)c == alphabet[i]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
//[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,2,0,1,0,0,3,1,0,0,0,0,0,0,0]
//[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,2,0,1,0,0,3,1,0,0,0,0,0,0,0]