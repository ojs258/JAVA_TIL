package school.week8;

import java.util.List;

public class BitwiseUpperLowerCase {
    public List<Character> solution(char str){
        return List.of(change(str),str);
    }
    char change(char str){
        return (char)(str ^ 32);
    }
    public static void main(String[] args) {
        List<Character> solutiona = new BitwiseUpperLowerCase().solution('a');
        List<Character> solutionA = new BitwiseUpperLowerCase().solution('A');

        for (Character c : solutiona) {
            System.out.println("ca = " + c);
        }
        for (Character c : solutionA) {
            System.out.println("cA = " + c);
        }

    }
}
