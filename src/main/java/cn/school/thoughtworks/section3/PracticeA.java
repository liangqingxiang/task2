package cn.school.thoughtworks.section3;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Iterator iterator = object.get("value").iterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            Integer value = collectionA.get(str);
            if (value != null)
                collectionA.put(str, value - 1);
        }
        return collectionA;
    }
}
