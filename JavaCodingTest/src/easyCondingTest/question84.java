package easyCondingTest;

public class question84 {
    public static void main(String[] args) {
        String[] solution = new Solution84().solution("i love you");

        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}

class Solution84 {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
}