package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumber extends JFrame {

    private int number;
    private boolean guess=false;
    private int cur,prev;

    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button1;
    private JLabel label2;
    private JLabel label1;

    public int getNumber(){ return number; }

    private void RandomNumber(){
        Random ran=new Random();
        number=ran.nextInt(1000);
    }

    public GuessTheNumber(){
        RandomNumber();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(mainPanel);
        setSize(400,400);
        cur=number;

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(guess==true){
                    RandomNumber();
                    cur=number;
                    textField1.setEditable(true);
                    guess=false;
                    return;
                }
                prev=cur;
                cur=Integer.parseInt(textField1.getText());
                if(cur==number){
                    JOptionPane.showMessageDialog(null,"Correct!","You are correct",JOptionPane.PLAIN_MESSAGE);
                    mainPanel.setBackground(new Color(238,238,238));
                    label2.setText("");
                    textField1.setEditable(false);
                    guess=true;
                    return;
                }
                if(cur>number)
                    label2.setText("Too High");
                else
                    label2.setText("Too Low");

                System.out.println(cur);
                if(Math.abs(number-prev)<Math.abs(number-cur))
                    mainPanel.setBackground(Color.BLUE);
                else
                    mainPanel.setBackground(Color.RED);
            }
        });
    }
}
