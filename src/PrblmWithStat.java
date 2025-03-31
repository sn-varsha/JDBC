import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PrblmWithStat {
    public static void main(String[] args) throws Exception {
        int sid = 101;
        String sname = "max";
        int marks = 48;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Varsha@3112";
        String sql = "insert into student values("+sid+",'"+sname+"',"+marks+")";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st =  con.createStatement();
        st.execute(sql);

        con.close();
        System.out.println("Connection closed");
    }
}
