package javase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
    Connection conn = null;
    Statement statement = null;
    public JdbcUtils(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/book","root","root");
            statement = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(String sql){
        try {
            int i = statement.executeUpdate(sql);
            if(i>0){
                System.out.println("修改成功");
            }else{
                System.out.println("修改失败");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if (statement != null){
                    statement.close();
                }
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }



}
