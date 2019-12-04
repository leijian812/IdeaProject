package demo;

import java.lang.reflect.Field;

/**
 * @author LeiJian
 * @date 2019/11/24 12:38
 */
public class demo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer a=1;
        Integer b=2;
        asd(a, b);
        System.out.println("a:" + a + "---" + "b:" + b);

        /**
         * 不能写代码
         */

    }

    static void asd(Integer a, Integer b) throws IllegalAccessException, NoSuchFieldException {

        Field field=Integer.class.getDeclaredField("value");
        Integer temp = 0;//= new Integer(a);
        field.setAccessible(true);
        field.set(a,b);
        field.set(b,temp);

    }

}
