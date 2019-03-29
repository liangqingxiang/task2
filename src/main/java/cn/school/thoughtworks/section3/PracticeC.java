package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();
        Iterator iterator = collectionA.iterator();
        while (iterator.hasNext()) {
            String c = (String) iterator.next();
            if (collection3.get(c) != null)
                collection3.put(c, collection3.get(c)+1);
            else
                collection3.put(c, 1);
        }
        Iterator iterator1 = object.get("value").iterator();
        while (iterator1.hasNext()) {
            String str = (String) iterator1.next();
            Integer value = collection3.get(str);
            if (value != null)
                collection3.put(str, value-value/3);
        }
        return collection3;
    }
}
