package com.todoapp.Screens;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class topPanel extends JLabel {
    public topPanel(){
        this.setBounds(50, 50, 200, 50);
        this.setText("Todo App");
        this.setFont(new Font("Comic Sans", Font.BOLD, 40));
        this.setBackground(Color.white);
        this.setLayout(null);

    }
}
