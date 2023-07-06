package easyCondingTest;

public class question36 {
    public static void main(String[] args) {
        boolean solution = new Solution36().solution(true, false, false, false);
        System.out.println(solution);
    }
}

class Solution36 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}