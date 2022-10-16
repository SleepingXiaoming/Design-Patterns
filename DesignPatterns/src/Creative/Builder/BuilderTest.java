package Creative.Builder;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/12 14:24
 */
public class BuilderTest {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal mealA = mealBuilder.SetA();
        mealA.showItems();
        System.out.println(mealA.getTotalPrice());

        Meal mealB = mealBuilder.SetB();
        mealB.showItems();
        System.out.println(mealB.getTotalPrice());
    }
}
