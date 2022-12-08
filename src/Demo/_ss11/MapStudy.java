package Demo._ss11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapStudy {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(100, "A");
        map.put(101, "C");
        map.put(101, "B");
        map.put(102, "C");
        map.put(105, "C");
        map.put(106, "G");

        show(map);
    }

    public static void show(Map<Integer, String> map) {
       for(Map.Entry<Integer, String> entry: map.entrySet()){
           System.out.println(entry.getKey()+ "---"+ entry.getValue());
       }
    }
}
