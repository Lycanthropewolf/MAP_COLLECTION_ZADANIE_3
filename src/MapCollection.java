import java.util.HashMap;
import java.util.Map;

public class MapCollection {


    public static Map<String, Integer> map = new HashMap<>();


    public static void addToMap(String str, Integer count) {
        if (map.containsKey(str) && map.get(str).equals(count)) {
            throw new RuntimeException(" Такое значение уже есть");
        }
        map.put(str, count);

    }
}
