package study.Test3_3;


/**
 * @author LJ
 * @date 2019/9/29 20:01
 */
public class Main {
    public static void main(String[] args) {

        ICal circle =new Circle(3.0);
        System.out.println(circle.toString());
        ICal rectangle = new Rectangle(1.0,2.0);
        System.out.println(rectangle.toString());
    }
}
