package Builder;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/12 11:19
 */
public class MealBuilder {
    public Meal SetA() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal SetB() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coca());
        return meal;
    }
}
