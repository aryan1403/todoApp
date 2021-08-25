package com.todoapp.Screens;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class todolist extends JLabel {
    public todolist(String[] arr) {
        this.setBounds(100, 250, 600, 200);
        String res = "";
        for (String s : arr) {
            if (s != null) {
                res += s + "\n";
            }
        }
        this.setText(res);
        this.setFont(new Font("", Font.BOLD, 15));
        this.setBackground(Color.white);
        this.setLayout(null);
    }
}
