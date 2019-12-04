package study.test3;

/**
 * @author LJ
 * @date 2019/9/28 16:55
 */
public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        if(triangle.isJudge()){
            System.out.println(triangle.getArea()+"\t"+triangle.getPerimeter());
        }
        else{
            System.out.println("无效");

        }
    }
}
