package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    String value;

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JPasswordField pinNo;
    JButton submit, cancel;

    Random ran = new Random();
    long card = (ran.nextLong() % 90000000L) + 1409963000000000L;
    String cardNo = " " + Math.abs(card);
    String car1 = cardNo.substring(cardNo.length()-4);


    Signup3(String formNo) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.value = formNo;

        JLabel label1 = new JLabel("Page 3");
        label1.setFont(new Font("Raleway", Font.BOLD, 22));
        label1.setBounds(280, 40, 400,40);
        add(label1);

        JLabel label2 = new JLabel("Account Details:");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(280, 70, 400, 40);
        add(label2);

        JLabel labelAccTy = new JLabel("Account Type :");
        labelAccTy.setFont(new Font("Raleway", Font.BOLD, 18));
        labelAccTy.setBounds(100, 140, 200, 30);
        add(labelAccTy);

        r1 = new JRadioButton("Saving Account");
        r1.setBackground(new Color(213, 247, 239));
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(100, 180, 150, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBackground(new Color(213, 247, 239));
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(100, 220, 200, 30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBackground(new Color(213, 247, 239));
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBounds(400, 180, 200, 30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBackground(new Color(213, 247, 239));
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBounds(400, 220, 250, 30);
        add(r4);

        ButtonGroup checkboxGroup = new ButtonGroup();
        checkboxGroup.add(r1);
        checkboxGroup.add(r2);
        checkboxGroup.add(r3);
        checkboxGroup.add(r4);

        JLabel labelCardno = new JLabel("Card Number :");
        labelCardno.setFont(new Font("Raleway", Font.BOLD, 18));
        labelCardno.setBounds(100, 280, 200, 30);
        add(labelCardno);

        JLabel labelCardtext = new JLabel("(Your 16-digit Card Number)");
        labelCardtext.setFont(new Font("Raleway", Font.BOLD, 12));
        labelCardtext.setBounds(100, 300, 200, 30);
        add(labelCardtext);

        JLabel labelCard = new JLabel("XXXX-XXXX-XXXX-" + car1 );
        labelCard.setFont(new Font("Raleway", Font.BOLD, 18));
        labelCard.setBounds(330, 280, 250, 30);
        add(labelCard);

        JLabel labelText = new JLabel("(It would appear on Atm card/Cheque Book and Statements)");
        labelText.setFont(new Font("Raleway", Font.BOLD, 12));
        labelText.setBounds(330, 300, 400, 30);
        add(labelText);

        JLabel labelPIN = new JLabel("PIN :");
        labelPIN.setFont(new Font("Raleway", Font.BOLD, 18));
        labelPIN.setBounds(100, 350, 200, 30);
        add(labelPIN);

        JLabel password = new JLabel("(4-digit Password)");
        password.setFont(new Font("Raleway", Font.BOLD, 12));
        password.setBounds(100, 370, 200, 30);
        add(password);

        pinNo = new JPasswordField();
        pinNo.setEchoChar('X');
        pinNo.setFont(new Font("Raleway", Font.BOLD, 18));
        pinNo.setBounds(330, 350, 250, 30);
        add(pinNo);

        JLabel labelSerTy = new JLabel("Service Required :");
        labelSerTy.setFont(new Font("Raleway", Font.BOLD, 18));
        labelSerTy.setBounds(100, 430, 200, 30);
        add(labelSerTy);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(213, 247, 239));
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 470, 150, 30);
        add(c1);

        c2 = new JCheckBox("Mobile Banking");
        c2.setBackground(new Color(213, 247, 239));
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(100, 520, 150, 30);
        add(c2);

        c3 = new JCheckBox("Cheque Book");
        c3.setBackground(new Color(213, 247, 239));
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 570, 150, 30);
        add(c3);

        c4 = new JCheckBox("Internet Banking");
        c4.setBackground(new Color(213, 247, 239));
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(400, 470, 250, 30);
        add(c4);

        c5 = new JCheckBox("Email Alert");
        c5.setBackground(new Color(213, 247, 239));
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(400, 520, 150, 30);
        add(c5);

        c6 = new JCheckBox("e-Statement");
        c6.setBackground(new Color(213, 247, 239));
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(400, 570, 150, 30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declare that the above entered details are correct to the best of my knowledge", true);
        c7.setBackground(new Color(213, 247, 239));
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 640, 1000, 30);
        add(c7);

        JLabel labelForm = new JLabel("Form No. :");
        labelForm.setFont(new Font("Raleway", Font.BOLD, 14));
        labelForm.setBounds(600, 10, 100, 30);
        add(labelForm);

        JLabel labelFormNo = new JLabel(value);
        labelFormNo.setFont(new Font("Raleway", Font.BOLD, 14));
        labelFormNo.setBounds(680, 10, 100, 30);
        add(labelFormNo);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250, 680, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(400, 680, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(new Color(213, 247, 239));
        setLayout(null);
        setSize(850, 800);
        setLocation(400, 20);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = "null";
        if(r1.isSelected()) {
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        String cardno = cardNo;
        String pin =  String.valueOf(pinNo.getPassword());

        String fac = "";
        if(c1.isSelected()) {
            fac += "ATM Card, " ;
        }
        if (c2.isSelected()) {
            fac += "Moblie Banking, ";
        }
        if (c3.isSelected()) {
            fac += "Cheque Book, ";
        }
        if (c4.isSelected()) {
            fac += "Internet Banking, ";
        }
        if (c5.isSelected()) {
            fac += "Email Alerts, ";
        }
        if (c6.isSelected()) {
            fac += "e-Statement";
        }

        try {
            if (e.getSource() == submit) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the Fields");
                } else {
                    Con con3 = new Con();
                    String q = "insert into signupthree values('"+value+"', '"+atype+"', '"+cardno+"', '"+pin+"', '"+fac+"')";
                    String q1 = "insert into login value('"+value+"', '"+cardno+"', '"+pin+"')";
                    con3.statement.executeUpdate(q);
                    con3.statement.executeUpdate(q1);
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardno+"\n Pin : " + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource() == cancel) {
                System.exit(0);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static  void  main(String[] args) {
        new Signup3("");
    }
}