package com.ebizx.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	public MyFrame(){
        super("JTextField in a JFrame");
        // Use the dafault metal styled titlebar
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        JTextField field = new JTextField("AnilVerma", 25);
        add(field);        
        String longVal = Long.toString((long)Math.pow(2, 45));        
        field.setText(longVal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new FlowLayout());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new MyFrame();
    }

}
