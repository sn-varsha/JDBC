import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CRUDOperations {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Varsha@3112";
//        String sql = "insert into student values(5, 'john', 48)";
//        String sql = "update student set sname='max' where sid=5";
        String sql = "delete from student where sid=5";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st =  con.createStatement();
//        boolean status = st.execute(sql);
//        System.out.println(status);
        st.execute(sql);

        con.close();
        System.out.println("Connection closed");

    }
}
