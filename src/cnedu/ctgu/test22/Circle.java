package cnedu.ctgu.test22;

/**
 * @author LeiJian
 * @date 2019/10/31 10:56
 */
public class Circle extends Shape{
    public double r;
    public double area;
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        area = Math.PI*r*r;
        return area;
    }
    public Circle(double r) {
        super();
        this.r = r;
    }
}
