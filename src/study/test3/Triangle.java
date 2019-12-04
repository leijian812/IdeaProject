package study.test3;

/**
 * @author LJ
 * @date 2019/9/28 16:54
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    private double area;
    private double perimeter;
    private boolean judge;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public boolean isJudge() {
        if((a+b>c)&&(a+c)>b&&(b+c)>a) {
            judge = true;
        }
        else judge = false;
        return judge;
    }


    public double getArea() {
        double p;
        p = (a+b+c) / 2.0;
        this.area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    public double getPerimeter() {
        this.perimeter = a + b + c;
        return perimeter;
    }
}
