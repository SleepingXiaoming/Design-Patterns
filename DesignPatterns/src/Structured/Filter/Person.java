package Structured.Filter;

/**
 * @description: 被过滤分类的实体类 Person
 * @author: xiaoming
 * @date: 2022/10/16 21:29
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", maritalStatus='" + maritalStatus + '\'' + '}';
    }
}
