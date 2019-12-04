package study.Test3_3;

/**
 * @author LJ
 * @date 2019/9/29 20:04
 */
public class Rectangle implements ICal{
    private double length;
    private double weight;

    Rectangle(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    @Override
    public double getPerimeter() {
        return 2.0*(length+weight);
    }

    @Override
    public double getArea() {
        return length*weight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ",  weight=" + weight +
                ",  getPerimeter="+ String.format("%.2f",getPerimeter())+
                ",  getArea="+ String.format("%.2f",getArea())+
                '}';
    }
}
