package study.Test4_1;

/**
 * @author LeiJian
 * @date 2019/10/27 13:04
 */
public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        ICal circle = new OuterClass.Circle(3);
        System.out.println("圆的面积：");
        System.out.println(String.format("%.2f",circle.getArea()));
        ICal rectangle = outerClass.getRectangle();
        System.out.println("长方形的面积：");
        System.out.println(String.format("%.2f",rectangle.getArea()));

    }
}
