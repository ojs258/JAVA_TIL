package easyCondingTest;

public class question67 {
    public static void main(String[] args) {
        String[] solution = new Solution67().solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"});

        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
class Solution67 {
    public String[] solution(String[] names) {
        int arrLen = names.length % 5 == 0 ? names.length / 5: names.length / 5 + 1;
        String[] answer = new String[arrLen];
        for (int i = 0, j = 0; i <arrLen; i++, j += 5) {
            answer[i] = names[j];
        }
        return answer;
    }
}