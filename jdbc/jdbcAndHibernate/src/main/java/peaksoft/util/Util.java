package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String url = "jdbc:postgresql://localhost:5432/db";
    private static final String user = "postgres";
    private static final String password = "1234";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,user,password);
//            System.out.println("Connected!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
