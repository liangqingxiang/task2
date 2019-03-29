package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        Iterator iterator = collection1.iterator();
        while (iterator.hasNext()) {
            String c = (String) iterator.next();
            String key = c.substring(0, 1);
            String regEx="[^0-9]";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(c);
            String numStr=m.replaceAll("").trim();
            int num=1;
            if(numStr!=null&&numStr!="")
                num= Integer.parseInt(numStr);
            if (map.get(key) == null)
                map.put(key, 0);
            map.put(key, map.get(key) + num);
        }
        return map;
    }
}
