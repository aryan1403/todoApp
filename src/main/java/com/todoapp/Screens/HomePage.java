package com.todoapp.Screens;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import com.todoapp.DB.db;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage implements ActionListener {
    private int X = 800;
    private int Y = 600;

    JButton button = new JButton("Button");
    JButton addtodo = new JButton("+");
    JTextField textField = new JTextField();

    public HomePage() {
        button.setBounds(50, 400, 300, 50);
        button.setBackground(new Color(23,23,23));
        button.setFont(new Font("Comic Sans", Font.ITALIC, 25));
        button.setFocusable(false);
        button.setForeground(Color.white);
        button.setLayout(null);
        button.addActionListener(this);

        addtodo.setBounds(520, 150, 70, 40);
        addtodo.setBackground(new Color(148, 0, 211));
        addtodo.setFocusable(false);
        addtodo.setFont(new Font("Comic Sans", Font.BOLD, 20));
        addtodo.setForeground(Color.white);
        addtodo.addActionListener(this);

        textField.setText("Add a new Todo");
        textField.setBounds(50, 150, 450, 40);
        textField.setFont(new Font("Aerial", Font.PLAIN, 18));

        String[] arr = new db().getAllTheDocuments();

        JFrame frame = new JFrame();
        frame.setSize(X, Y);
        frame.add(new topPanel());
        frame.add(new todolist(arr));
        //frame.add(button);
        frame.add(addtodo);
        frame.add(textField);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Button is clicked!");
        }
        if(e.getSource() == addtodo) {
            String txt = textField.getText();
            new db().add("todo", txt);
        }
        
    }
}
