package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        Iterator iterator = collection1.iterator();
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
        return map;
    }
}
