package javaapplication4;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author waelm
 */
public class JavaApplication4 {
    Connection conn=null;
    
public static Connection ConnecrDb(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/mysql_2","root","");
        return conn;
          
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
return null;
}

   
}
