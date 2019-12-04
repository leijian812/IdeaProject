package study.test1;

/**
 * @author LJ
 * @date 2019/9/28 16:48
 */
public class StudentTest {
    public static void main(String [] args) {
        Student student1 = new Student("叶孤城",123,"男");
        Student student2 = new Student("西门吹雪",456,"男");
        System.out.println(student1.getName()+"\t"+student1.getNo()+"\t"+student1.getSex());
        System.out.println(student2.getName()+"\t"+student2.getNo()+"\t"+student2.getSex());
    }


}
