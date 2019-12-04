package study.Test5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author LeiJian
 * @date 2019/10/26 12:50
 */
public class test {
    public static String filterAlphabet(String s) {
        s = s.replaceAll("[^[a-zA-Z]]", "");
        return s;
    }
    public static int[] countLetters(String s){
        int[] counts = new int[26];
        for(int i = 0;i < s.length(); i++){
            if(Character.isLetter(s.charAt(i)))
                counts[s.charAt(i)-'a']++;
        }
        return counts;
    }

    public static void main(String[] args) {
        String ch = "AB#C123*ab$$c($XYZ";
        ch = filterAlphabet(ch);
        System.out.println("去除字符串中所有的非英文字符之后的字符串: "+ ch);
        int[] counts = countLetters(ch.toLowerCase());
        for(int i = 0;i < counts.length; i++){
            if(counts[i] != 0)
                System.out.println((char)('a' + i) + ":" + counts[i]);
        }
    }
    }