package Structured.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 创建 过滤接口的实体类，以男性作为划分
 * @author: xiaoming
 * @date: 2022/10/16 21:37
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> res = new ArrayList<>();
        for (Person person : persons)
            if ("male".equalsIgnoreCase(person.getGender())) res.add(person);
        return res;
    }
}
