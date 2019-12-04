package study.Test3_1;

import java.util.Scanner;

/**
 * @author LJ
 * @date 2019/9/28 17:00
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double r;
        r = reader.nextDouble();
        Circle circle = new Circle(r);
        Ball ball = new Ball(r);
        Cone cone = new Cone(r);
        Cylinder cylinder = new Cylinder(r);
        System.out.println("圆的面积：" + String.format("%.2f", circle.getArea()));
        System.out.println("球的体积：" + String.format("%.2f", ball.getValumn()));

        System.out.println("请输入圆锥的高：");
        cone.setHigh(reader.nextDouble());
        System.out.println("圆锥的体积：" + String.format("%.2f", cone.getValumn()));

        System.out.println("请输入圆柱的高：");
        cylinder.setHigh(reader.nextDouble());
        System.out.println("圆柱的体积：" + String.format("%.2f", cylinder.getValumn()));
    }
}
