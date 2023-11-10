import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {

    public String db_url = "jdbc:mysql://localhost:3306/world";
    public String db_driver = "com.mysql.cj.jdbc.Driver";
    public String db_username = "root";
    public String db_password = "mysqladmin";

    public void openConnection(){
        Connection conn = null;
        try{
            Class.forName(db_driver);
            conn = DriverManager.getConnection(db_url, db_username, db_password);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
