package Structured.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 创建 过滤接口的实体类，以女性作为划分
 * @author: xiaoming
 * @date: 2022/10/16 21:40
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> res = new ArrayList<>();
        for (Person person : persons)
            if ("female".equalsIgnoreCase(person.getGender())) res.add(person);
        return res;
    }
}
