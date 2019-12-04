package study.test1;

/**
 * @author LJ
 * @date 2019/9/28 16:45
 */
public class Student {
    private String name;
    private int no;
    private String sex;
    String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    Student(String name, int no, String sex) {
        super();
        this.name = name;
        this.no = no;
        this.sex = sex;
    }
}
