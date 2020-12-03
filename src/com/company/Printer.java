package com.company;

import javax.swing.*;
import java.awt.*;

public class Printer extends JFrame{
    private JTextArea field1;
    private JTextArea field2;
    private JTextArea field3;
    private JLabel label1;
    private JLabel label2;
    private JRadioButton radio1;
    private JRadioButton radio2;
    private JRadioButton radio3;
    private JCheckBox checkbox1;
    private JCheckBox checkbox2;
    private JCheckBox checkbox3;
    private JCheckBox printCheckbox4;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private ButtonGroup buttongroup;
    private JPanel mainPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JLabel label=new JLabel("                                            ");
    private JComboBox box;

    public Printer(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,200);
        setVisible(true);
        GridBagConstraints gbc=new GridBagConstraints();


        field1=new JTextArea(5,5);
        field2=new JTextArea(5,3);
        field3=new JTextArea(5,5);
        label1=new JLabel("Printer: MyPrinter");
        label2=new JLabel("Print Quality: ");
        radio1=new JRadioButton("Selection");
        radio2=new JRadioButton("All");
        radio3=new JRadioButton("Applet");
        checkbox1=new JCheckBox("Image");
        checkbox2=new JCheckBox("Text");
        checkbox3=new JCheckBox("Code");
        printCheckbox4=new JCheckBox("Print to File");
        button1=new JButton("OK");
        button2=new JButton("Cancel");
        button3=new JButton("Setup...");
        button4=new JButton("Help");


        panel1=new JPanel();
        panel4=new JPanel();
        panel4.setVisible(true);
        panel4.setLayout(new GridLayout(3,1));
        panel1.add(label1);
        panel1.add(field1);
        panel4.add(checkbox1);
        panel4.add(checkbox2);
        panel4.add(checkbox3);
        panel1.add(panel4);
        panel1.add(label2);
        panel1.setVisible(true);


        panel2=new JPanel();
        panel5=new JPanel();
        panel5.setVisible(true);
        panel5.setLayout(new GridLayout(3,1));
        panel2.add(label);
        panel2.add(field2);
        panel5.add(radio1);
        panel5.add(radio2);
        panel5.add(radio3);
        panel2.add(panel5);
        String combo[]={"High","Low"};
        box=new JComboBox(combo);
        panel2.add(box);
        panel2.add(printCheckbox4);


        panel3=new JPanel();
        panel6=new JPanel();
        panel6.setVisible(true);
        panel6.setLayout(new GridLayout(4,1));
        panel3.add(field3);
        panel6.add(button1);
        panel6.add(button2);
        panel6.add(button3);
        panel6.add(button4);
        panel3.add(panel6);


        mainPanel=new JPanel();
        mainPanel.setLayout(new GridLayout(1,3));


        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.setVisible(true);
        add(mainPanel);
    }
}
