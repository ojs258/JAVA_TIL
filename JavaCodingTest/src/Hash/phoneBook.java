package Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class phoneBook {
    public boolean solution(String[] phone_book) {
        List<String> pb = new ArrayList<>();
        int cnt = 0;
        Collections.addAll(pb, phone_book);
        Collections.sort(pb);
        for(String str1 : pb){
            for(String str2 : pb){
                if(!str2.equals(str1) && str2.contains(str1)){
                    cnt++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new phoneBook().solution(new String[]{});
    }
}
