package Structured.Filter;

import java.util.List;

/**
 * @description: 逻辑与 同时满足两个条件
 * @author: xiaoming
 * @date: 2022/10/16 21:42
 */
public class AndCriteria implements Criteria {
    Criteria criteria1;
    Criteria criteria2;

    public AndCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return criteria1.meetCriteria(criteria2.meetCriteria(persons));
    }
}
