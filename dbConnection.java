package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author aman
 */
public class dbConnection {

    Connection con = null;
    Statement st;
    ResultSet rs;

    public dbConnection() throws Exception {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
        st = con.createStatement();
    }

    public void entry(String query, String query2) throws Exception {
        System.out.println("connected to the Bank");
        int count = st.executeUpdate(query);
        System.out.println("updated entry2 query1");
        int count1 = st.executeUpdate(query2);
        System.out.println("Account Created Successfully");
        st.close();
        con.close();
    }

    public void transection(String uid, String amount) throws Exception {
        System.out.println("connected to the Bank in entry");
        String query = "insert into `" + uid + "`(`Date`,`From`,`To`,`Mode`,`Amount`,`Interest`) values('" + java.time.LocalDate.now()
                + "','Self','Self','Debit'," + amount + ",0);";
        int count = st.executeUpdate(query);
        System.out.println("Money Added to account");
        st.close();
        con.close();
    }

    public int check(float amount, String uid) {
        ResultSet rs1;
        try {
            rs1 = st.executeQuery("select sum(Amount) as 'total'  from " + uid + ";");

            rs1.next();
            float total = Float.parseFloat(rs1.getString(1));
            st.close();
            con.close();
            if (amount <= total) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
            return 3;
        }

    }

    public ArrayList fetch(String acc, String userid) throws Exception {
        ArrayList info = new ArrayList();
        ArrayList infoChecked = new ArrayList();
        try {
            System.out.println("inside search");
            rs = st.executeQuery("select * from userDetails where userDetails.Account_Number like " + acc + ";");
            System.out.println("rs = " + rs);

            rs.next();
            for (int i = 1; i < 14; i++) {

                info.add(rs.getString(i));
                System.out.println(rs.getString(i));
            }
        } catch (Exception e) {
            System.out.println("this is 'rs' set exception  " + e);
        }
        if (!(userid.isEmpty())) {
            infoChecked = verify(info, userid);
            return infoChecked;
        } else {
            return info;
        }

    }

    public ArrayList verify(ArrayList info, String userid) throws Exception {
        System.out.println("checking for user id ");
        if (userid.equals(info.get(5))) {
            ResultSet rs1 = st.executeQuery("select sum(Amount) as 'total'  from " + info.get(5) + ";");
            rs1.next();
            info.add(rs1.getString(1));
//                System.out.println(info);
            st.close();
            con.close();
        } else {
            info.clear();
        }

//        } catch (Exception e) {
//            System.out.println("this is 'rs' set exception  " + e);
//
//        }
        System.out.println("nullity = " + info.isEmpty());
        return info;
    }

}
