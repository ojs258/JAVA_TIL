package programmersLevelZero;

public class question85 {
    public static void main(String[] args) {
        String[] solution = new Solution85().solution(" i    love  you");

        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
class Solution85 {
    public String[] solution(String my_string) {
        char[] tmp = my_string.toCharArray();
        String answer = "";
        int cond = 0;
        if(tmp[0] != ' ') cond = 1;

        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] != ' '){
                answer += String.valueOf(tmp[i]);
                cond = 1;
            } else {
                answer += cond == 1 ? String.valueOf(tmp[i]) : "";
                cond = 0;
            }
        }
        return answer.split(" ");
    }
}