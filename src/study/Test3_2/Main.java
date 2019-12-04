package study.Test3_2;

import java.util.Scanner;

/**
 * @author LJ
 * @date 2019/9/29 17:30
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        System.out.println("请输入矩形的长和宽：");
        Shape r = new Rectangle(reader.nextDouble(),reader.nextDouble());
            r.getArea();
            r.getPerimeter();
        System.out.println("请输入圆的半径：");
        Shape c = new Circle(reader.nextDouble());
		    c.getArea();
		    c.getPerimeter();



    }

}
