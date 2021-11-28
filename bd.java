package first_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class bd {
    public static void main(String[] args) throws Exception {
        int userid=12123;
        String phone="1234567890";
        String uname="naman";
        String query= String.format("insert into user(userID,username,phone) values({},'{}','{}')", userid,uname,phone);
//        Class.forName("java.sql.Driver");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","");
        Statement st = con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        String str = rs.getString("username");
        System.out.println(str);
        st.close();
        con.close();

    }
}
