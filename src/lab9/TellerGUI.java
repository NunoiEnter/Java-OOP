import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TellerGUI extends JFrame implements ActionListener {

    private JPanel formPanel, buttonPanel;
    private JLabel lblBalance, lblAmount;
    private JTextField txtBalance, txtAmount;
    private JButton btnDeposit, btnWithdraw, btnExit;
    
    // Declare Account object
    private Account account;

    public TellerGUI() {
        //set default values for Account
        account = new Account();
        account.name = "monxca"; 
        account.balance = 6000;

        //JFrame
        setTitle("Teller GUI");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        //Panel_Grid Layout
        formPanel = new JPanel(new GridLayout(2, 2, 5, 5));

        lblBalance = new JLabel("Balance");
        lblAmount = new JLabel("Amount");

        // current balance
        txtBalance = new JTextField(String.valueOf(account.balance));
        txtBalance.setEditable(false); //read0nly
        
        txtAmount = new JTextField();

        formPanel.add(lblBalance);
        formPanel.add(txtBalance);
        formPanel.add(lblAmount);
        formPanel.add(txtAmount);

        // ButtonPanel
        buttonPanel = new JPanel(new FlowLayout());

        btnDeposit = new JButton("Deposit");
        btnWithdraw = new JButton("Withdraw");
        btnExit = new JButton("Exit");

        // Listeners
        btnDeposit.addActionListener(this);
        btnWithdraw.addActionListener(this);
        btnExit.addActionListener(this);

        buttonPanel.add(btnDeposit);
        buttonPanel.add(btnWithdraw);
        buttonPanel.add(btnExit);

        // add panels>Frame
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        double amount = 0;

        // Parse from text
        try {
            if (source != btnExit) {
                amount = Double.parseDouble(txtAmount.getText());
            }
        } catch (NumberFormatException ex) {
            return;
        }

        //Deposit
        if (source.equals(btnDeposit)) {
            account.deposit(amount);
            txtBalance.setText(String.valueOf(account.balance));
        }
        // Withdraw
        else if (source.equals(btnWithdraw)) {
            account.withdraw(amount);
            txtBalance.setText(String.valueOf(account.balance));
        }
        else if (source.equals(btnExit)) {
            System.exit(0);
        }
    }
}