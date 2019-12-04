package study.Test4_2;

import java.util.regex.Pattern;

/**
 * @author LeiJian
 * @date 2019/10/29 18:35
 */
public class CheckID {

    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public void Checkid(String id) throws LengthLessThanSix,LengthMoreThanSix,NumberException{
        if(id.length() > 6)
            throw new LengthMoreThanSix("输入的学号位数大于六");
        else if(id.length() < 6)
            throw new LengthLessThanSix("输入的学号位数小于六");
        else if(!isNumeric(id))
            throw new NumberException("输入的学号位数包含非数字字符");
    }
}
