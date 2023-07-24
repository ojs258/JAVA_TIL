package Hash;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class retire {
    public static void main(String[] args) {
        String[] strings = new String[]{"asdf","qwer"};
        long count = Arrays.stream(strings).filter(s -> s.equals("asdf")).count();
    }
}
