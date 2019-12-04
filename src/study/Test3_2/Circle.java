package study.Test3_2;

/**
 * @author LJ
 * @date 2019/9/29 17:28
 */
public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void getArea() {
        System.out.println("圆面积为:"+String.format("%.2f",Math.PI*r*r));
    }

    @Override
    public void getPerimeter() {
        System.out.println("圆周长为:"+String.format("%.2f",2*Math.PI*r));
    }
}
