package programmersLevelZero;

public class question115 {
    public static void main(String[] args) {
        int solution = new Solution015().solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29});
    }
}
class Solution015 {
    public int solution(int[] date1, int[] date2) {
        for (int i = 0; i < 3; i++) {
            if(date1[i] < date2[i]){
                return 1;
            }else if(date1[i] > date2[i]){
                return 0;
            }
        }
        return 0;
    }
}