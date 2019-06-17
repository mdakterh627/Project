
package evidence2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Repository {
    
    
    public Repository(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error "+ e.getMessage());
//            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Product>loadProduct(){
     ArrayList<Product> products = new ArrayList<>();
     
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Akterh","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select id, Name, Quantity,Price from product");
            while(rs.next()){
            products.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4)));
            
        
        }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error "+ ex.getMessage());
//            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        return products;
        }
     
     
     
     return products;
    }
    public void updateProduct(int id, int Quantity){
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Akterh","root","");
            PreparedStatement pst = con.prepareStatement("Update Product set Quantity = ? where id =?");
            pst.setInt(1, Quantity);
            pst.setInt(2, id);
            int result = pst.executeUpdate();
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error "+ e.getMessage());
            
            
            
//            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }

   
   
    
    
}
