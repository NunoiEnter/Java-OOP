/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tinyk
 */
import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JButton btnPlus, btnMinus, btnMul, btnDiv;
    private JTextField txt1, txt2, txtResult;

    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new GridLayout(4, 1));

        txt1 = new JTextField();
        txt2 = new JTextField();
        txtResult = new JTextField();

        p = new JPanel();
        p.setLayout(new FlowLayout());

        btnPlus = new JButton("บวก");
        btnMinus = new JButton("ลบ");
        btnMul = new JButton("คูณ");
        btnDiv = new JButton("หาร");

        p.add(btnPlus);
        p.add(btnMinus);
        p.add(btnMul);
        p.add(btnDiv);

        fr.add(txt1);
        fr.add(txt2);
        fr.add(p);
        fr.add(txtResult);

        fr.pack();
        fr.setVisible(true);
    }
}