package school.week11;

import java.util.Arrays;
import java.util.List;

public class SecretMap {
    public static String[] solution(int size, int[] secretKeys1, int[] secretKeys2){
        List<String> map1 = Arrays.stream(secretKeys1).boxed()
                .map(Integer::toBinaryString)
                .map(s -> String.format("%"+size+"s",s).replace(" ","0")).toList();
        List<String> map2 = Arrays.stream(secretKeys2).boxed()
                .map(Integer::toBinaryString)
                .map(s -> String.format("%"+size+"s",s).replace(" ","0")).toList();
        String[] answer = new String[size];
        for (int i = 0; i < size; i++) {
            String tmp = "";
            for (int j = 0; j < size; j++) {
                if ("1".equals(map1.get(i).split("")[j]) || "1".equals(map2.get(i).split("")[j])){
                    tmp += "#";
                }
                tmp += " ";
            }
            answer[i] = tmp.trim();
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] solution1 = SecretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        for (String s : solution1) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------");
        String[] solution2 = SecretMap.solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});
        for (String s : solution2) {
            System.out.println(s);
        }
    }
}
