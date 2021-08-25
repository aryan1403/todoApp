package com.todoapp.Screens;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

public class todolist extends JLabel {
    public todolist(String[] arr) {
        this.setBounds(50, 250, 600, 200);
        int labelX = 0;
        int labelY = 0;

        int counter = 1;
        List<JLabel> list = new ArrayList<>();
        for (String s : arr) {
            if (s != null) {
                JLabel label = new JLabel("   "+counter+".  "+s);
                label.setBounds(labelX, labelY, 600, 50);
                label.setBackground(Color.gray);
                label.setOpaque(true);
                label.setForeground(Color.white);
                label.setFont(new Font("Comic Sans", Font.PLAIN, 22));
                label.setLayout(null);
                list.add(label);
                labelY += 60;
                counter++;
            }
        }
        this.setBackground(Color.white);
        //this.setFocusable(true);
        this.setOpaque(true);
        this.setLayout(null);
        for (JLabel label : list) {
            this.add(label);
        }
    }
}
