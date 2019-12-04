package study.test2;

/**
 * @author LJ
 * @date 2019/9/28 16:51
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    private double area;
    private boolean judge;

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
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public boolean isJudge() {
        if((a+b>c)&&(a+c)>b&&(b+c)>a) {
            judge = true;
        }
        else judge = false;
        return judge;
    }
    public void setJudge(boolean judge) {
        this.judge = judge;
    }
    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getarea() {
        double p;
        p = (a+b+c) / 2.0;
        this.area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
}
