package study.test2;

/**
 * @author LJ
 * @date 2019/9/28 16:52
 */
public class TestShape {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Triangle triangle = new Triangle(3,4,5);
        Rectangle rectangle = new Rectangle(4,5);
        Circle circle = new Circle(3);

        System.out.println("三角形面积为： " + String.format("%.2f",triangle.getarea()));
        System.out.println("矩形面积为： " + String.format("%.2f",rectangle.getArea()));
        System.out.println("圆的面积为： " + String.format("%.2f",circle.getArea()));
    }
}
