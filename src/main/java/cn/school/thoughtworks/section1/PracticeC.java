package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        Collection exists=new ArrayList<String>(collection1);
        Collection notexists=new ArrayList<String>(collection1);
        exists.removeAll(collection2.get("value"));
        notexists.removeAll(exists);
        return (List<String>) notexists;
    }
}
