
package myprojectjava;

import java.awt.Image;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.*;


public class GeneralClass {
    private static Connection con = null;
    
    public static void setImagetoLabel(String path , JLabel picShow){
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image newImage = img.getScaledInstance(picShow.getWidth(), picShow.getHeight(), img.SCALE_SMOOTH);
        ImageIcon newImageIcon = new ImageIcon(newImage);
        picShow.setIcon(newImageIcon);
        
        
    
    }
    public static void showDataIntoTable(String dbTable, JTable table, int id){
    
        con = DataBaseConnection.dataBaseConnection();
        try{
            Statement st = con.createStatement();
            String Queery = "select * from "+ dbTable; //SAelect All form Table
            ResultSet rs = st.executeQuery(Queery);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }catch(Exception ex){
        
        }
        finally{
            
            
         try{
        
        con.close();
        }catch(Exception ex){
        
        }
        
        }
    
    
    
    }

    static void showDataIntoTable(String donner_information_, JTable AllAbilableBloodTable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
