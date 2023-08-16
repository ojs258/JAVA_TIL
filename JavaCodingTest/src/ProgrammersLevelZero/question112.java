package ProgrammersLevelZero;

public class question112 {
    public static void main(String[] args) {
        String solution = new Solution012().solution(new String[]{"abc", "def", "ghi"}, "ef");

        System.out.println("solution = " + solution);

    }
}
class Solution012 {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(String s : str_list){
            if (!s.contains(ex)){
                answer += s;
            }
        }
        return answer;
    }
}