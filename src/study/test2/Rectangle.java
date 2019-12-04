package study.test2;

/**
 * @author LJ
 * @date 2019/9/28 16:52
 */
public class Rectangle {
    public double a;
    public double b;
    public double area;
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getArea() {
        area = a*b;
        return area;
    }
    public Rectangle(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }
}
