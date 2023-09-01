package ProgrammersHighScoreKit.ExhaustiveSearch;

public class FindPrimeNumber {
    public int solution(String numbers) {
        int size = numbers.length();
        List<String> nums = Arrays.stream(numbers.split(""))
                                    .collect(Collectors.toList());
        List<Integer> answer = new ArrayList<>();
        
        for(int sizeCnt = 0; sizeCnt < size; sizeCnt++) {
             for(int i = 0; i < size; i++) {
                 String number = nums.get(i);
                 for(int j = 0; j < sizeCnt; j++) {
                    number += nums.get(j);
                 }
                 if(isPrime(Integer.parseInt(number))){
                     answer.add(Integer.parseInt(number));
                 }
             }
        }
        return answer.stream().mapToInt(n -> n).toArray().length;
    }
    
    public boolean isPrime(int num) {
        if(num < 2) {
            return false;
        } else {
            for(int i = 2; i * i < num; i++) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }
}
