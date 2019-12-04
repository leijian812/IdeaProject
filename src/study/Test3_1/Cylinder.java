package study.Test3_1;

/**
 * @author LJ
 * @date 2019/9/28 17:00
 */
public class Cylinder extends Circle {
    Cylinder(double r) {
        super(r);
    }
    private double high;

    public double getHigh() {
        return high;
    }

    void setHigh(double high) {
        this.high = high;
    }
    double getValumn() {
        return getArea() * high;
    }

}
