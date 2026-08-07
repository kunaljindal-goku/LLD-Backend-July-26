import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Client3 {

    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        map.put("ABC",87.0);
        map.put("XYZ",98.0);
        map.put("GHJ",86.5);

        for(String key: map.keySet()) {
            System.out.println("Key: "+key+", value: "+map.get(key));
        }
    }
}
