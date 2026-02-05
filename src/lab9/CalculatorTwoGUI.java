/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tinyk
 */
import java.awt.*;
import java.awt.event.*; // Import event handling package
import javax.swing.*;

// Implement ActionListener
public class CalculatorTwoGUI implements ActionListener {

    private JFrame fr;
    private JPanel p;
    private JTextField txt;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton bPlus, bMinus, bMul, bDiv, bEqual, bClear;


    private double num1 = 0;
    private double num2 = 0;
    private String operator = "";

    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());

        txt = new JTextField();
        p = new JPanel();
        p.setLayout(new GridLayout(4, 4)); // Grid

        //  Buttons
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bPlus = new JButton("+");

        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        bMinus = new JButton("-");

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        bMul = new JButton("x");

        b0 = new JButton("0");
        bClear = new JButton("c");
        bEqual = new JButton("=");
        bDiv = new JButton("/");

        
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bEqual.addActionListener(this);
        bClear.addActionListener(this);

        // Add buttons to Panel
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bPlus);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bMinus);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bMul);
        p.add(b0);
        p.add(bClear);
        p.add(bEqual);
        p.add(bDiv);

        fr.add(txt, BorderLayout.NORTH);
        fr.add(p, BorderLayout.CENTER);

        fr.setSize(300, 300);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource(); 
        String command = ae.getActionCommand(); 

        // Clear
        if (source == bClear) {
            txt.setText("");
            num1 = 0;
            num2 = 0;
            operator = "";
        } 
        // Operators 
        else if (source == bPlus || source == bMinus || source == bMul || source == bDiv) {
            String currentText = txt.getText();
            if (!currentText.isEmpty()) {
                num1 = Double.parseDouble(currentText);
            }
            operator = command;
            txt.setText("");
        } 
        //Equals
        else if (source == bEqual) {
            String currentText = txt.getText();
            if (!currentText.isEmpty()) {
                num2 = Double.parseDouble(currentText);
                
                double result = 0;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "x":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            result = 0; 
                        }
                        break;
                }
                

                if (result % 1 == 0) {
                    txt.setText(String.valueOf((int) result));
                } else {
                    txt.setText(String.valueOf(result));
                }
            }
        } 

        else {
            txt.setText(txt.getText() + command);
        }
    }
}