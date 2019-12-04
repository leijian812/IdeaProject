package study.Test3_2;

/**
 * @author LJ
 * @date 2019/9/29 17:25
 */
public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getArea() {
        System.out.println("矩形面积为:"+a*b);
    }

    @Override
    public void getPerimeter() {
        System.out.println("矩形周长为:"+2*(a+b));
    }
}

