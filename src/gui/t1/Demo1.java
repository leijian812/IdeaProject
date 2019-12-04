package gui.t1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author LeiJian
 * @date 2019/10/27 20:21
 */
public class Demo1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame f = new JFrame("计算器");
        f.setLayout(null);

        JTextField t = new JTextField();
        t.setBounds(20, 5, 250, 40);
        f.add(t);

        int x = 20;
        int y = 55;
        String[] str = {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","."};
        for(int i = 0;i < str.length; i++)
        {
            JButton btn = new JButton();
            btn.setText(str[i]);
            btn.setBounds(x, y, 60, 40);
            if(x < 215)
            {
                x += 65;
            }
            else
            {
                x = 20;
                y += 45;
            }
            f.add(btn);
        }
        f.setBounds(500,200,300,300);
        f.setVisible(true);

    }

}
