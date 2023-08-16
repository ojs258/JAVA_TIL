package ProgrammersLevelZero;

public class question78 {
    public static void main(String[] args) {
        String[] solution = new Solution78().solution(new String[]{"AAA","BBB","CCC","DDD"});

        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
class Solution78 {
    public String[] solution(String[] strArr) {
        for (int i = 0; i <strArr.length; i++) {
                strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return strArr;
    }
}