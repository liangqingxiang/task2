package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        Iterator iterator = collectionA.iterator();
        while (iterator.hasNext()) {
            String c = (String) iterator.next();
            String key = c.substring(0, 1);
            if (map.get(key) == null)
                map.put(key, 0);
            int num = 0;
            if (c.length() > 1) {
                String numStr = c.substring(2, 3);
                num = Integer.valueOf(numStr);
            } else num = 1;
            map.put(key, map.get(key) + num);
        }
        Iterator iterator1 = object.get("value").iterator();
        while (iterator1.hasNext()) {
            String str = (String) iterator1.next();
            Integer value = map.get(str);
            if (value != null)
                map.put(str, value-value/3);
        }
        return map;
    }
}
