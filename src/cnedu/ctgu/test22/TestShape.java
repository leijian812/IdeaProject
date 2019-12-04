package cnedu.ctgu.test22;

/**
 * @author LeiJian
 * @date 2019/10/31 11:05
 */
public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        System.out.println("三角形面积："+String.format("%2f",circle.getArea()));
        Triangle triangle = new Triangle(3,4,5);
        if(triangle.isJudge()){
            System.out.println("三角形面积："+String.format("%2f",triangle.getArea()));
        }
    }

}
