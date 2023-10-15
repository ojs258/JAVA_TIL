package chap01._07optional.withOptional;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapRepository {
    private Map<String, String> map = new HashMap<>();

    MapRepository(){
        map.put("EXIST_KEY", "value");
    }

    public Optional<String> getOptionalValue(String key) {
        return Optional.ofNullable(map.get(key));
    }
}
