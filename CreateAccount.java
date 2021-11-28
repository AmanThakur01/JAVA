package bank;

import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreateAccount extends JFrame {

    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextField t9;
    JTextField t10;
    JTextField t11;
    JTextField t12;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JButton b1, b2, b3;

    public CreateAccount() throws Exception {
//        try {
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        l8 = new JLabel();
        l9 = new JLabel();
        l10 = new JLabel();
        l11 = new JLabel();
        l12 = new JLabel();
        System.out.println("all instance varable created");
        l1.setText("Account Number ");
        add(l1);
        t1 = new JTextField(12);
        add(t1);
        l2.setText("Full Name ");
        t2 = new JTextField(22);
        add(l2);
        add(t2);
        l3.setText("Father's Name ");
        t3 = new JTextField(22);
        add(l3);
        add(t3);
        l4.setText("Mother's Name ");
        t4 = new JTextField(22);
        add(l4);
        add(t4);
        l5.setText("User ID ");
        t5 = new JTextField(25);
        t5.setText("*Start with Character");
        add(l5);
        add(t5);
        l6.setText("Date ");
        t6 = new JTextField(10);
        add(l6);
        add(t6);
        l7.setText("Address ");
        t7 = new JTextField(100);
        add(l7);
        add(t7);
        l8.setText("Phone No. ");
        t8 = new JTextField(12);
        add(l8);
        add(t8);
        l9.setText("E-Mail ");
        t9 = new JTextField(50);
        add(l9);
        add(t9);
        l10.setText("Income/Year ");
        t10 = new JTextField(12);
        add(l10);
        add(t10);
        l11.setText("Occupation ");
        t11 = new JTextField(22);
        add(l11);
        add(t11);
        l12.setText("Aadhar No. ");
        t12 = new JTextField(12);
        add(l12);
        add(t12);
        System.out.println("value assigned");
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        b3 = new JButton("Cancel");

        add(b1);
        add(b2);
        add(b3);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(780, 400);

        System.out.println("connecting to Database");
        b1.addActionListener(a -> {
            try {
                String account = t1.getText();
                String name = t2.getText();
                String fname = t3.getText();
                String mname = t4.getText();
                String userid = t5.getText();
                String date = t6.getText();
                String address = t7.getText();
                String phone = t8.getText();
                String mail = t9.getText();
                float income = Float.parseFloat(t10.getText());
                String occupation = t11.getText();
                String aadhar = t12.getText();
                String query = String.format("insert into userDetails(Account_Number,Name,Fathers_Name,Mothers_Name,ID,Date,Address,Phone,Email,Annual_Income,Occupation,Aadhar_no) values('" + account + "','" + name + "','" + fname + "','" + mname + "','" + userid + "','" + date + "','" + address + "','" + phone + "','" + mail + "'," + income + ",'" + occupation + "','" + aadhar + "');");
                String query2 = String.format("create table if not exists `"+userid+"`(`No` INT NOT NULL AUTO_INCREMENT, `Date` VARCHAR(10) NOT NULL,`From` VARCHAR(12) NOT NULL,`To` VARCHAR(12) NOT NULL,`Mode` VARCHAR(45) NOT NULL,`Amount` DECIMAL NOT NULL,`Interest` FLOAT NOT NULL,PRIMARY KEY (`No`));");
                new dbConnection().entry(query,query2);
            } catch (Exception ex) {
                Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
//        } catch (Exception e) {
//            System.out.println("---Error--->>" + e);
    }

}
