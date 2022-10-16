package Structured.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 创建 过滤接口的实体类，以单身作为划分
 * @author: xiaoming
 * @date: 2022/10/16 21:41
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> res = new ArrayList<>();
        for (Person person : persons)
            if ("single".equalsIgnoreCase(person.getMaritalStatus())) res.add(person);
        return res;
    }
}
