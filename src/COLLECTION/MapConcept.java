package COLLECTION;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapConcept {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "Adarsh");
        stringMap.put(12, "Mohan");
        System.out.println(stringMap);
        stringMap.put(1, "Anmol Kumar");
        System.out.println(stringMap);

        System.out.println(stringMap.get(1));
        stringMap.remove(12);
        System.out.println(stringMap);

        System.out.println(stringMap.containsKey(2));

        stringMap.put(3, "Mohan");
        stringMap.put(6, "Ankit");
        stringMap.put(9, "Vikash");
        System.out.println(stringMap);

        System.out.println(stringMap.keySet());
        System.out.println(stringMap.values());

        stringMap.put(null, "Anand");
        System.out.println(stringMap);

        stringMap.put(null, "Anand");
        System.out.println(stringMap);

        Set<Map.Entry<Integer, String>> entries = stringMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }


    }
}
