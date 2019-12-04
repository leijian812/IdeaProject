package study.Test3_1;

/**
 * @author LJ
 * @date 2019/9/28 16:56
 */
public class Circle {
    protected double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

}
