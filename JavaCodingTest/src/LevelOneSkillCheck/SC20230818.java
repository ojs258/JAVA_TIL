package LevelOneSkillCheck;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SC20230818 {
    public String solution(String[] seoul) {
        return "김서방은 "+
                Arrays.stream(seoul).collect(Collectors.toList()).indexOf("Kim")
                + "에 있다";
    }
}
