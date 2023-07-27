package Hash;

import java.util.*;

public class phoneBook {
    public boolean solution(String[] phone_book) {
        List<String> pb = new LinkedList<>();
        Collections.sort(pb);
        for(String str1 : pb){
            for(String str2 : pb){
                if(!str1.equals(str2)){
                    if(str2.startsWith(str1)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean solution = new phoneBook().solution(new String[]{"12", "123", "1235", "567", "88"});
        System.out.println("solution = " + solution);
    }
}
