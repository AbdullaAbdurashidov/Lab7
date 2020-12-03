package com.company;

import javax.swing.*;
import java.awt.*;

public class CalculatorForm extends JFrame{

    private JPanel textFrame;
    private JPanel buttonFrame;
    private JTextField TextField1;
    private JButton buttons[]=new JButton[16];

    public CalculatorForm(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,200);
        setVisible(true);
        setLayout(new FlowLayout());
        TextField1=new JTextField();
        textFrame=new JPanel();
        textFrame.setLayout(new GridLayout(1,1));
        textFrame.setPreferredSize(new Dimension(180,20));
        textFrame.add(TextField1);


        buttonFrame=new JPanel();
        buttonFrame.setLayout(new GridLayout(4,4));
        buttonFrame.setPreferredSize(new Dimension(180,120));

        buttons[0]=new JButton("7");
        buttons[1]=new JButton("8");
        buttons[2]=new JButton("9");
        buttons[3]=new JButton("/");
        buttons[4]=new JButton("4");
        buttons[5]=new JButton("5");
        buttons[6]=new JButton("6");
        buttons[7]=new JButton("*");
        buttons[8]=new JButton("1");
        buttons[9]=new JButton("2");
        buttons[10]=new JButton("3");
        buttons[11]=new JButton("-");
        buttons[12]=new JButton("0");
        buttons[13]=new JButton(".");
        buttons[14]=new JButton("=");
        buttons[15]=new JButton("+");

        for(int i=0;i<buttons.length;i++){
            buttonFrame.add(buttons[i]);
        }

        add(textFrame);
        add(buttonFrame);
    }
}
