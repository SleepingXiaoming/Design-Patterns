package Structured.Filter;

import java.util.List;

/**
 * @description: 逻辑或 满足两个条件之一即可
 * @author: xiaoming
 * @date: 2022/10/16 21:42
 */
public class OrCriteria implements Criteria {
    Criteria criteria1;
    Criteria criteria2;

    public OrCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> p1 = criteria1.meetCriteria(persons);
        List<Person> p2 = criteria2.meetCriteria(persons);
        for (Person p : p2)
            if (!p1.contains(p))
                p1.add(p);
        return p1;
    }
}
