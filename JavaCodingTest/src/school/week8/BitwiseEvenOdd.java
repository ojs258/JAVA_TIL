package school.week8;

public class BitwiseEvenOdd {
    public String solution(int num){
        return isEven(num) == 1 ? "Odd":"Even";
    }
    int isEven(int num){
        return (num & 1);
    }

    public static void main(String[] args) {
        String solution1 = new BitwiseEvenOdd().solution(11);
        String solution2 = new BitwiseEvenOdd().solution(14);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
