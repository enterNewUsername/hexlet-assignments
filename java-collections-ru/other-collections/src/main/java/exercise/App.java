package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.Set;
//import java.util.TreeSet;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        LinkedHashMap<String, String> resultMap = new LinkedHashMap<>();
        Map<String, Object> tempMap1 = new LinkedHashMap<>();
        Map<String, Object> tempMap2 = new LinkedHashMap<>();
        tempMap1.putAll(map1);
        tempMap2.putAll(map2);

        for (Map.Entry<String, Object> set1: map1.entrySet()) {
            for (Map.Entry<String, Object> set2: map2.entrySet()) {
                if (set2.getKey().equals(set1.getKey()) && set1.getValue().equals(set2.getValue())) {
                    resultMap.put(set1.getKey(), "unchanged");
                    tempMap1.remove(set1.getKey());
                    tempMap2.remove(set2.getKey());
                } else if (set2.getKey().equals(set1.getKey())) {
                    resultMap.put(set1.getKey(), "changed");
                    tempMap1.remove(set1.getKey());
                    tempMap2.remove(set2.getKey());
                }
            }
        }

        for (Map.Entry<String, Object> set2: tempMap2.entrySet()) {
            resultMap.put(set2.getKey(), "added");
        }
        for (Map.Entry<String, Object> set1: tempMap1.entrySet()) {
            resultMap.put(set1.getKey(), "deleted");
        }

        return resultMap;
    }
}
//END
