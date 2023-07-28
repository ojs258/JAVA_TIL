package Hash;

import java.util.HashMap;
import java.util.Map;

public class clothes {
    public int solution(String[][] clothes) {
        Map<String, Integer> closet = new HashMap<>();
        int combine = 0;

        for(String[] arr : clothes) {
            closet.put(arr[1],closet.getOrDefault(arr[1],0) + 1);
        }
        int n = closet.size();
        for(int i = 1; i <= n; i++){
            int totalCnt = fac(n) / (fac((n-i)) * i);
            int eachNumCnt = totalCnt * i / n;
            combine += (eachNumCnt);
        }

        for(String str: closet.keySet()) {
            closet.put(str,closet.get(str) * combine);
        }

        int answer = 0;

        for(int num : closet.values()){
            answer += num;
        }
        return answer;
    }
    public int fac(int n){
        int sum = 1;
        while(n > 1){
            sum *= n;
            --n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int solution = new clothes().solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
        System.out.println("solution = " + solution);
    }
}