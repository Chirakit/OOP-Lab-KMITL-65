package Lab11_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculate implements ActionListener{
    private JFrame fr;
    private JPanel p1, p2;
    private JTextField txt1, txt2, txt3;
    private JButton btn1, btn2, btn3, btn4;
    
    public Calculate(){
        fr = new JFrame("เครื่องคิดเลข");//Calculate
        p1 = new JPanel();
        p2 = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        btn1 = new JButton("+");
        btn2 = new JButton("-");
        btn3 = new JButton("*");
        btn4 = new JButton("/");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        
        p1.setLayout(new GridLayout(4,1));
        p1.add(txt1);
        p1.add(txt2);
        p1.add(p2);
        p1.add(txt3);
        
        p2.setLayout(new FlowLayout());
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btn4);
        
        fr.getContentPane().add(p1);
        fr.setFont(new Font("TimesRoman", Font.BOLD,60));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400,200);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        double num1 = Double.parseDouble(txt1.getText());
        double num2 = Double.parseDouble(txt2.getText());
        if(ae.getSource().equals(btn1)) {
            txt3.setText(num1 + num2 + "");
        } else if(ae.getSource().equals(btn2)) {
            txt3.setText(num1 - num2 + "");
        } else if(ae.getSource().equals(btn3)) {
            txt3.setText(num1 * num2 + "");
        } else if(ae.getSource().equals(btn4)) {
            txt3.setText(num1 / num2 + "");
        }
    }
}
