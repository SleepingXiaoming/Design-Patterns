package Structured.Flyweight;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/19 15:10
 */
public class Circle {
    private String color;
    private int radius;
    private String content;

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", content='" + content + '\'' +
                '}';
    }
}
