package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        Iterator iterator = collection1.iterator();
        while (iterator.hasNext()) {
            String c = (String) iterator.next();
            if (map.get(c) != null)
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        return map;
    }
}
