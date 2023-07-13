package programmersLevelZero;

public class question10 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        System.out.println("solution = " + solution10.solution("He11oWor1d", "lloWorl", 	2));
    }
}

class Solution10 {
    public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0,s)
                .concat(overwrite_string)
                .concat(my_string.substring(overwrite_string.length() + s,
                                            my_string.length()));
    }
    // substring메서드로 슬라이싱해서 concat메서드를 이용해 입력받은 s자리에 삽입한다.
    // 삽입한 문자열이 차지하고 남는 문자열만큼을 다시 substring메서드로 슬라이싱한다.
    // concat메서드를 이용해 삽입해준다.
}
