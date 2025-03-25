package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import static java.awt.Color.WHITE;

public class Withdrawal extends JFrame implements ActionListener {
    String pin;

    TextField textField;

    JButton b1, b2;

    Withdrawal(String pin) {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1920, 1080);
        add(l3);

        this.pin = pin;

        JLabel label1 = new JLabel("MAXIMUM  WITHDRAWAL IS RS. 10,000 :");
        label1.setForeground(Color.GREEN);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(540, 200, 700, 35);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE  ENTER  YOUR  AMOUNT :");
        label2.setForeground(Color.GREEN);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(540, 250, 400, 35);
        l3.add(label2);

        textField = new TextField();
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(WHITE);
        textField.setBounds(540, 300, 350, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(900, 440, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(900, 495, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1920, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Withdraw");
                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }

                    if(balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawal', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }

            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            new main_Class(pin);
            setVisible(false);

        }
    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}
