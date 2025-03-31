import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UseOfPreparedStat {
    public static void main(String[] args) throws Exception {
        int sid = 102;
        String sname = "janu";
        int marks = 52;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Varsha@3112";
        String sql = "insert into student values(?,?,?)";

        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement st =  con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);
        st.execute();

        con.close();
    }
}
