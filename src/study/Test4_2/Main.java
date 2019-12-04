package study.Test4_2;

import java.util.Scanner;

/**
 * @author LeiJian
 * @date 2019/10/29 18:54
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入学号：");
        String id = reader.next();

        CheckID checkid = new CheckID();
        try{
            checkid.Checkid(id);
        }catch (LengthMoreThanSix ex){
            ex.printStackTrace();
        }
        catch (LengthLessThanSix ey){
            ey.printStackTrace();
        }
        catch (NumberException ez){
            ez.printStackTrace();
        }
    }
}
