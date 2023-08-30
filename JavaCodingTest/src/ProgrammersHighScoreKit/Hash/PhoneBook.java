package ProgrammersHighScoreKit.Hash;

import java.util.*;

public class PhoneBook {
    public boolean solution(String[] phoneBook) {
        //셋 생성 시점에 정렬을 해주는 TreeSet 이용
        Set<String> pb = new TreeSet<>(List.of(phoneBook));

        // "작은 숫자가 큰 숫자에 접두사인지 확인" 이라는 개념을 버리고
        // "큰 숫자들의 0~length-1과 같은 숫자가 있는지 확인" 이라는 개념 으로 접근 해야함.
        for(String str : pb){
            for(int i = 1; i < str.length(); i++){
                if(pb.contains(str.substring(0,i))){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean solution = new PhoneBook().solution(new String[]{"12", "123", "1235", "567", "88"});
        System.out.println("solution = " + solution);
    }
}
