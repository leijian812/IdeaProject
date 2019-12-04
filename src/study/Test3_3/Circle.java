package study.Test3_3;

/**
 * @author LJ
 * @date 2019/9/29 19:48
 */
public class Circle implements ICal{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",  perimeter=" + String.format("%.2f",getPerimeter())+
                ",  area=" + String.format("%.2f",getArea())+
                '}';
    }
}
