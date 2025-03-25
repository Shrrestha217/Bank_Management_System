package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JTextField textName, fName, textEmail, textAddress, textCity, textPincode, textState;
    JDateChooser dateChooser;
    JRadioButton r1, r2;
    JButton next;
    JComboBox<String> maritalStatus;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO.: " + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(380, 70, 600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details:");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(330, 110, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFName.setBounds(100, 240, 200, 30);
        add(labelFName);

        fName = new JTextField();
        fName.setFont(new Font("Raleway", Font.BOLD, 14));
        fName.setBounds(300, 240, 400, 30);
        add(fName);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 290, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 290, 400, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 340, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(new Color(224, 245, 218));
        r1.setBounds(300, 340, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(new Color(224, 245, 218));
        r2.setBounds(450, 340, 80, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMS.setBounds(100, 440, 200, 30);
        add(labelMS);

        String[] mS = {"Select", "Single", "Married", "Widowed", "Divorced", "Separated", "Others"};
        maritalStatus = new JComboBox<>(mS);
        maritalStatus.setBackground(new Color(237, 240, 245));
        maritalStatus.setSelectedIndex(0);
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 16));
        maritalStatus.setBounds(300, 440, 200, 30);
        add(maritalStatus);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        textAddress.setBounds(300, 490, 400, 30);
        add(textAddress);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel labelPC = new JLabel("Pin Code :");
        labelPC.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPC.setBounds(100, 590, 200, 30);
        add(labelPC);

        textPincode = new JTextField();
        textPincode.setFont(new Font("Raleway", Font.BOLD, 14));
        textPincode.setBounds(300, 590, 400, 30);
        add(textPincode);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 700, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(224, 245, 218));
        setLayout(null);
        setSize(850, 800);
        setLocation(450, 80);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formNo = first;
        String name = textName.getText();
        String fname = fName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if(r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }

        String email = textEmail.getText();
        String marital = null;
        int select = maritalStatus.getSelectedIndex();
        switch (select) {
            case 0: break;
            case 1: marital = "Single"; break;
            case 2: marital = "Married"; break;
            case 3: marital = "Widowed"; break;
            case 4: marital = "Divorced"; break;
            case 5: marital = "Separated"; break;
            case 6: marital = "Others"; break;
        }

        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPincode.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Con con1 = new Con();
                String q = "insert into signup values('"+formNo+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        }catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
