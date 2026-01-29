/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tinyk
 */
import javax.swing.*;
import java.awt.*;

public class TellerGUI extends JFrame {

    public TellerGUI() {
        setTitle("Teller GUI");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel formPanel = new JPanel(new GridLayout(2, 2, 5, 5));

        JLabel lblBalance = new JLabel("Balance");
        JLabel lblAmount = new JLabel("Amount");

        JTextField txtBalance = new JTextField("6000");
        JTextField txtAmount = new JTextField();

        txtBalance.setEditable(false);

        formPanel.add(lblBalance);
        formPanel.add(txtBalance);
        formPanel.add(lblAmount);
        formPanel.add(txtAmount);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton btnDeposit = new JButton("Deposit");
        JButton btnWithdraw = new JButton("Withdraw");
        JButton btnExit = new JButton("Exit");

        buttonPanel.add(btnDeposit);
        buttonPanel.add(btnWithdraw);
        buttonPanel.add(btnExit);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
