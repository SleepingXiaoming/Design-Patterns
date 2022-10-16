package Structured.Filter;

import java.util.List;

/**
 * @description: 过滤的接口
 * @author: xiaoming
 * @date: 2022/10/16 21:34
 */
public interface Criteria {
    // 定义过滤的方法
    List<Person> meetCriteria(List<Person> persons);
}
