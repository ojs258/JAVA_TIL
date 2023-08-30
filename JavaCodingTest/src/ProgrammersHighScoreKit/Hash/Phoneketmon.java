package ProgrammersHighScoreKit.Hash;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Phoneketmon {
    public int solution(int[] nums) {
        /*
         * 해시의 특징중에서 문제가 요구하는 특징이 중복제거 밖에없기 때문에
         * 해시보단 Set 자료구조가 더 어울린다. 하지만 중복 제거만 필요하다면
         * 한 번 더 최적화 하여 stream().distinct() 메서드만으로도 해결 된다.
         * */
        int len = nums.length / 2;
        int cnt = (int) Arrays.stream(nums).distinct().count();
        // 중복 제거한 종류와 가져 가도 되는 마리 수 중 더 작은걸 리턴
        return Math.min(len,cnt);
    }

    public int solution1(int[] nums){
        //해시로 푸는법
        Set<Integer> monsters = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        return Math.min(monsters.size(),nums.length/2);
    }

    public static void main(String[] args) {
        new Phoneketmon().solution(new int[]{3,1,2,3});
    }
}
