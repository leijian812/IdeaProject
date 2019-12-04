package study.test2;

/**
 * @author LJ
 * @date 2019/9/28 16:50
 */
public class Circle {
    public double r;
    public double area;
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getArea() {
        area = Math.PI*r*r;
        return area;
    }
    public Circle(double r) {
        super();
        this.r = r;
    }
}
