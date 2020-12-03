package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class TemperatureConverter extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JLabel label1;
    private JButton CONVERTButton;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;

    public TemperatureConverter(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(mainPanel);

        setSize(300,200);
        CONVERTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df=new DecimalFormat("#.##");
                double temperature=(Double.parseDouble(textField1.getText()));
                temperature=5*(temperature-32)/9;
                label2.setText(String.valueOf(df.format(temperature)));
                label4.setText(textField1.getText());
            }
        });
    }
}
