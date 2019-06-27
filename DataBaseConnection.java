
package myprojectjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataBaseConnection {
    private static Connection con= null;
    public static Connection dataBaseConnection(){
    try {
    Class.forName("com.mysql.jdbc.Driver");
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyProject","root","root");
    
    System.out.println("Connection success");
    return con;
    }catch(SQLException ex){
        System.out.println("DB Connection fail "+ex.getMessage());
    return null;
    }catch (ClassNotFoundException ex){
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Connection success");
    return con;
}
    
}
