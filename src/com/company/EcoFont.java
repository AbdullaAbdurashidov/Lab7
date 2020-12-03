package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcoFont extends JFrame {
    private JPanel mainPanel=new JPanel();
    private JPanel textPanel=new JPanel();
    private JTextArea area=new JTextArea(3,3);
    private JButton buttonUp=new JButton("Increase Font Size");
    private JButton buttonDown=new JButton("Decrease Font Size");
    private JButton printButton=new JButton("Print to EcoFont");
    private float fontSize=10f;

    public EcoFont(){
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     mainPanel.setLayout(new BorderLayout());
     setVisible(true);
     setExtendedState(JFrame.MAXIMIZED_BOTH);
     buttonUp.setPreferredSize(new Dimension(350,20));
     buttonDown.setPreferredSize(new Dimension(350,20));

     mainPanel.setVisible(true);
     mainPanel.add(printButton,BorderLayout.PAGE_START);
     mainPanel.add(area, BorderLayout.CENTER);
     mainPanel.add(buttonDown, BorderLayout.LINE_START);
     mainPanel.add(buttonUp, BorderLayout.LINE_END);
     add(mainPanel);


        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    area.print();
                }catch(Exception evt){
                    JOptionPane.showMessageDialog(mainPanel,"Error");
                }
            }
        });

        buttonUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fontSize<100f) {
                    fontSize++;
                    area.setFont(area.getFont().deriveFont(fontSize));
                }
            }
        });

        buttonDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fontSize>1f) {
                    fontSize--;
                    area.setFont(area.getFont().deriveFont(fontSize));
                }
            }
        });
    }
}
