package gui.t1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

/**
 * @author LeiJian
 * @date 2019/10/27 20:31
 */
public class Calculator extends JFrame {
    public static double sum=0;//存储每次计算的最终结果结果
    public static double num=0;//存储输入结果
    public static int   flag=11;//标记计算器的运算符号
    public static int   F=0;//判断等号是否出现以及是否重置计算结果
    public static int   f=0;//记录运算符一次性输入次数，防止多此输入运算符导致计算逻辑出错
    public static int   F1=0;//1/x计算标记变量
    public static String NUM="";//当输入数字和小数点按键时用于构建输入数据的字符串
    private static final long serialVersionUID = 1L;
    private static final String String = null;
    //该函数永与判断输出在屏幕上的数字是否需要输出小数点之后的数字，对于整数计算结果，不需要输出小数点之后的数字
    public static String Handle(String str){
        int n=str.indexOf(".");//首先判断小数点是否存在，存在返回小数点检索参数，不存在返回-1
        if(n!=-1)//小数点存在时
        {
            char [] s=str.toCharArray();//将字符串转换成字符数组逐个判断
            for(int i=n+1;(i<s.length)&&(i<=20);i++)//因为屏幕显示长度为20个字符，所以最多只需要判断20位即可
            {
                char s1=s[i];
                char s2='0';
                if(s1!=s2)//判断小数点后是否存在非0字符
                {
                    return str;//说明需要当前数字为double类型，返回整个字符串
                }
            }
            return str.substring(0,n);//说明当前数字为int型，只返回整数部分
        }
        return str;//如果输入的是不含小数点的数字，返回原数字
    }
    public String Eliminate(String str) {//删除（←）
        int l=str.length();//将输入的数字转换成字符串计算输入的数字长度
        if(l<=1)//当输入数字长度为l=1时，清除一位在屏幕上显示应该是数字0
        {
            str="0";
        }
        else//当输入数字长度大于l>1时，将最后一位删除，将前l-1为重新存入字符串
        {
            str=str.substring(0,l-1);
        }
        return str;
    }
    public String Zero(String str) {//归零（c），对数据进行初始化
        str="";
        F1=0;
        sum=0;
        num=0;
        flag=11;//在每次重新计算时将第一个输入的数字累加到存在最终结果的变量上
        return str;
    }
    public String Number(String str,String s)//输入数字键（0-9）
    {
        if(str.equals("0"))//当输入被全部清除时，str内有一个“0”字符，再次输入需要把该字符覆盖
        {
            str=s;
        }
        else {
            str=str+s;//将新输入的字符接到之前的数字末尾
        }
        return str;
    }
    public String DecimalPoint(String str)//输入小数点处理
    {
        int flag=str.indexOf(".");//判断当前输入数字中是否存在小数点
        int l=str.length();
        if(flag==-1)//如果不存在小数点添加小数点，否则直接返回当前值，防止添加多余的小数点
        {
            if(l==0)
            {
                str+="0";
            }
            str=str+".";
        }
        return str;
    }
    public void Operation(int flag)//六种运算和等号（+，-，*，/，%，1/x）
    {
//		System.out.println("flag="+flag);
//		System.out.println("num="+num);
//		System.out.println("sum="+sum);
//		System.out.println("-----------------");
        BigDecimal bigA = new BigDecimal(Double.toString(sum));
        BigDecimal bigB = new BigDecimal(Double.toString(num));

        if(flag==11)//加法
        {
            sum=bigA.add(bigB).doubleValue();
        }
        if(flag==12)//减法
        {
            sum=bigA.subtract(bigB).doubleValue();
        }
        if(flag==13)//乘法
        {
            sum=bigA.multiply(bigB).doubleValue();
        }
        if(flag==14)//除法
        {
            if(num==0)//当num等于0时属于不合法输入
            {
                NUM="输入错误：除数不能为0";//输出错误提示
                return ;
            }
            sum=sum/num;
            //		sum=bigA.divide(bigB).doubleValue();
        }
        if(flag==15)//取余
        {
            sum=sum%num;
        }
        if(flag==17)//1/x运算
        {
            System.out.println("********"+F1);
            if(F1==1)
            {
                if(num==0)
                {
                    NUM="输入错误：除数不能为0";
                    return ;
                }
                sum=1/num;
            }
            else
            {
                if(sum==0)
                {
                    NUM="输入错误：除数不能为0";
                    return ;
                }
                sum=1/sum;
            }
        }
        NUM=String.valueOf(sum);
        if(flag==16)//等号判断
        {
            NUM=String.valueOf(sum);
            flag=11;
            F=1;
            NUM="0";//字符串置空
        }
        return ;
    }
    //	public
    public Calculator() {
        //创建按键字符串
        final String[] str= {"←","c","%","1/x","7","8","9","+","4","5","6","-","1","2","3","*","0",".","/","="};
        //将每个按键编号，对动作进行判断
        final int[] next  = {18 ,19 ,15 ,  17 , 7 , 8 , 9 , 11, 4 , 5 , 6 , 12, 1 , 2 , 3 ,13 , 0 , 10, 14 ,16};
        setSize(300,400);//设置窗口大小
        setTitle("计算器 1.0");
        Container c=getContentPane();
        c.setLayout(new GridLayout(6,1,5,5));//将容器设置成6行1列的网格布局
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//设置文本字体和大小
        final JButton[] jb=new JButton[30];//创建按钮数字
        final JTextField jt=new JTextField("",20 );//创建文本框
        jt.setHorizontalAlignment(JTextField.RIGHT);//设置为右对齐
        JPanel[] p=new JPanel[6];//创建JPanel面板数组
        jt.setFont(new Font("宋体",Font.PLAIN,25));
        JPanel p0=new JPanel(new GridLayout(1,1,5,5));//初始化面板p0,设置一个一行一列的网格布局，用于文本框
        p0.add(jt);//添加文本框
        for(int i=0;i<5;i++)//循环输出按钮
        {
            p[i]=new JPanel(new GridLayout(1,4,5,5));//初始化面板数组，将每个面板设置成1行4列，用于安放按钮
            for(int j=0;j<4;j++)
            {
                final int n=i*4+j;//计算按键是第几个
                jb[n]=new JButton(str[i*4+j]);//为按钮设置数字
                jb[n].addActionListener(new ActionListener() {//按键事件监听
                    public void actionPerformed(ActionEvent e) {
//						System.out.println("按键输入："+n);
                        if(next[n]==18) {//消除
                            NUM=Eliminate(NUM);//调用清除函数
                            num=Double.parseDouble(NUM);//将String型数据转换成double型数据
                            jt.setText(Handle(NUM));
                        }
                        else if(next[n]==19)//归零
                        {
                            NUM=Zero(NUM);//调用归零函数
                            jt.setText("");//在文本显示区显示为空
                        }
                        else if(next[n]>=0&&next[n]<10)//数字键
                        {
                            if(F==1)
                            {
                                NUM=Zero(NUM);//调用归零函数
                                F=0;
                                F1=0;
                            }
                            f=0;
                            NUM=Number(NUM,str[n]);//调用数字输入函数
                            num=Double.parseDouble(NUM); //将String型数据转换成double型数据
                            jt.setText(Handle(NUM));//按字符串输出计算结果
                        }
                        else if(next[n]==10)//小数点
                        {
                            NUM=DecimalPoint(NUM);//调用添加小数点函数
                            num=Double.parseDouble(NUM);//将String型数据转换成double型数据
                            jt.setText(Handle(NUM));//按字符串输出计算结果
                        }
                        else if(next[n]>=11&&next[n]<=17)//运算
                        {
                            if(next[n]==16)//判断等号输入情况
                            {
                                F=1;//改变量用于判断每次计算结束后如何进行下一次计算
                            }		//F=0表示新一次计算，等于1表示继续使用上一次计算结果
                            else
                            {
                                F=0;
                            }
                            jt.setText(Handle(String.valueOf(sum)));//按字符串输出计算结果
                            f++;//记录按键输入次数
                            F1++;//记录1/x输入次数，判断如何调用1/x运算
                            if(next[n]==17)//
                            {
                                Operation(17);//调用运算函数计算上一次运算符运算结果
                                jt.setText(Handle(NUM));
                            }
                            else if(f==1)
                            {
                                Operation(flag);//调用运算函数计算上一次运算符运算结果
                                jt.setText(Handle(NUM));//按字符串输出计算结果
                            }
                            flag=next[n];//记录当前输入的运算符
                            num=0;
                            NUM="";//重置
                        }
                    }
                });
                p[i].add(jb[n]);//向面板添加按钮
            }
        }
        c.add(p0);//在容器中添加面板
        for(int i=0;i<5;i++)
        {
            c.add(p[i]);//在容器中添加面板
        }
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
