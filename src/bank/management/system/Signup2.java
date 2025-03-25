package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formNo;

    JComboBox<String> religionOption, catOptions, incomeOp, educationOp, occupationOp;
    JTextField panNo, aadharNo;
    JRadioButton senCz1, senCz2, exitAcc1, exitAcc2;
    JButton next;

    Signup2(String first) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formNo = first;

        JLabel label1 = new JLabel("Page 2");
        label1.setFont(new Font("Raleway", Font.BOLD, 22));
        label1.setBounds(300, 30, 600,40);
        add(label1);

        JLabel label2 = new JLabel("Additional Details:");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(300, 60, 600, 40);
        add(label2);

        JLabel labelRel = new JLabel("Religion :");
        labelRel.setFont(new Font("Raleway", Font.BOLD, 18));
        labelRel.setBounds(100,130,100,30);
        add(labelRel);

        String[] religion = {"Select", "Hinduism", "Islam", "Christianity", "Sikhism", "Buddhism", "Jainism", "Others"};
        religionOption = new JComboBox<>(religion);
        religionOption.setBackground(new Color(237, 240, 245));
        religionOption.setSelectedIndex(0);
        religionOption.setFont(new Font("Raleway", Font.BOLD, 16));
        religionOption.setBounds(300, 130, 200, 30);
        add(religionOption);

        JLabel labelCat = new JLabel("Category :");
        labelCat.setFont(new Font("Raleway", Font.BOLD, 18));
        labelCat.setBounds(100,180,100,30);
        add(labelCat);

        String[] category = {"Select", "General", "OBC", "General-EWS", "SC/ST", "Others"};
        catOptions = new JComboBox<>(category);
        catOptions.setBackground(new Color(237, 240, 245));
        catOptions.setSelectedIndex(0);
        catOptions.setFont(new Font("Raleway", Font.BOLD, 16));
        catOptions.setBounds(300, 180, 200, 30);
        add(catOptions);

        JLabel labelIn = new JLabel("Income Per annum :");
        labelIn.setFont(new Font("Raleway", Font.BOLD, 18));
        labelIn.setBounds(100,230,200,30);
        add(labelIn);

        String[] income = {"Select", "Nil", "< 100000", "100000-500000", "500000-1500000", "1500000-2500000", ">2500000"};
        incomeOp = new JComboBox<>(income);
        incomeOp.setBackground(new Color(237, 240, 245));
        incomeOp.setSelectedIndex(0);
        incomeOp.setFont(new Font("Raleway", Font.BOLD, 16));
        incomeOp.setBounds(300, 230, 200, 30);
        add(incomeOp);

        JLabel labelEdu = new JLabel("<html>Educational :<br>Qualification<html>");
        labelEdu.setFont(new Font("Raleway", Font.BOLD, 18));
        labelEdu.setBounds(100,280,200,60);
        add(labelEdu);

        String[] education = {"Select", "Uneducated", "10th Pass", "12th Pass", "Graduate", "Post-Graduate", "Others"};
        educationOp = new JComboBox<>(education);
        educationOp.setSelectedIndex(0);
        educationOp.setFont(new Font("Raleway", Font.BOLD, 16));
        educationOp.setBounds(300, 290, 200, 30);
        add(educationOp);

        JLabel labelOccu = new JLabel("Occupation :");
        labelOccu.setFont(new Font("Raleway", Font.BOLD, 18));
        labelOccu.setBounds(100,360,200,30);
        add(labelOccu);

        String[] occupation = {"Select", "Student", "Employed", "Self-Employed", "Unemployed", "Retired", "Others"};
        occupationOp = new JComboBox<>(occupation);
        occupationOp.setSelectedIndex(0);
        occupationOp.setFont(new Font("Raleway", Font.BOLD, 16));
        occupationOp.setBounds(300, 360, 200, 30);
        add(occupationOp);

        JLabel labelPAN = new JLabel("PAN Number :");
        labelPAN.setFont(new Font("Raleway", Font.BOLD, 18));
        labelPAN.setBounds(100,410,200,30);
        add(labelPAN);

        panNo = new JTextField();
        panNo.setFont(new Font("Raleway", Font.BOLD, 14));
        panNo.setBounds(300, 410, 400, 30);
        add(panNo);

        JLabel labelAadh = new JLabel("Aadhar Number :");
        labelAadh.setFont(new Font("Raleway", Font.BOLD, 18));
        labelAadh.setBounds(100,460,200,30);
        add(labelAadh);

        aadharNo = new JTextField();
        aadharNo.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharNo.setBounds(300, 460, 400, 30);
        add(aadharNo);

        JLabel labelSenCi = new JLabel("Senior Citizen :");
        labelSenCi.setFont(new Font("Raleway", Font.BOLD, 18));
        labelSenCi.setBounds(100,510,200,30);
        add(labelSenCi);

        senCz1 = new JRadioButton("Yes");
        senCz1.setFont(new Font("Raleway", Font.BOLD, 16));
        senCz1.setBackground(new Color(255, 245, 217));
        senCz1.setBounds(300, 510, 60, 30);
        add(senCz1);

        senCz2 = new JRadioButton("No");
        senCz2.setFont(new Font("Raleway", Font.BOLD, 16));
        senCz2.setBackground(new Color(255, 245, 217));
        senCz2.setBounds(450, 510, 80, 30);
        add(senCz2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(senCz1);
        buttonGroup.add(senCz2);

        JLabel labelExist = new JLabel("Existing Account :");
        labelExist.setFont(new Font("Raleway", Font.BOLD, 18));
        labelExist.setBounds(100,560,200,30);
        add(labelExist);

        exitAcc1 = new JRadioButton("Yes");
        exitAcc1.setFont(new Font("Raleway", Font.BOLD, 16));
        exitAcc1.setBackground(new Color(255, 245, 217));
        exitAcc1.setBounds(300, 560, 60, 30);
        add(exitAcc1);

        exitAcc2 = new JRadioButton("No");
        exitAcc2.setFont(new Font("Raleway", Font.BOLD, 16));
        exitAcc2.setBackground(new Color(255, 245, 217));
        exitAcc2.setBounds(450, 560, 80, 30);
        add(exitAcc2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(exitAcc1);
        buttonGroup1.add(exitAcc2);

        JLabel labelForm = new JLabel("Form No. :");
        labelForm.setFont(new Font("Raleway", Font.BOLD, 14));
        labelForm.setBounds(600, 10, 100, 30);
        add(labelForm);

        JLabel labelFormNo = new JLabel(formNo);
        labelFormNo.setFont(new Font("Raleway", Font.BOLD, 14));
        labelFormNo.setBounds(680, 10, 100, 30);
        add(labelFormNo);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 600, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(255, 245, 217));
        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) religionOption.getSelectedItem();
        String cate = (String) catOptions.getSelectedItem();
        String inco = (String) incomeOp.getSelectedItem();
        String edu = (String) educationOp.getSelectedItem();
        String occ = (String) occupationOp.getSelectedItem();

        String pan = panNo.getText();
        String aadhar = aadharNo.getText();

        String sen = "null";
        if(senCz1.isSelected()) {
            sen = "Yes";
        } else if (senCz2.isSelected()) {
            sen = "No";
        }

        String exAcc = "null";
        if(exitAcc1.isSelected()) {
            exAcc = "Yes";
        } else if (exitAcc2.isSelected()) {
            exAcc = "No";
        }

        try {
            if(panNo.getText().equals("") || aadharNo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Con con2 = new Con();
                String q = "insert into signuptwo values('"+formNo+"', '"+rel+"', '"+cate+"', '"+inco+"', '"+edu+"', '"+occ+"', '"+pan+"', '"+aadhar+"', '"+sen+"', '"+exAcc+"')";
                con2.statement.executeUpdate(q);
                new Signup3(formNo);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
