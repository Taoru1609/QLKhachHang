/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TUF
 */
public class DBConnect {
    static String url="jdbc:sqlserver://localhost\\NGUYENSTEGENLAP\\SQLEXPRESS:1433;databaseName=QLQ_NOOTEA";
     static String user="sa";
      static String pass="123456789";
      
      static{
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            //Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      }
      public static Connection getConnect(){
        try {
            Connection con=DriverManager.getConnection(url, user, pass);
       return con;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
           //Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      }
       public static void main(String[] args) {
        // check thử
        Connection con=getConnect();
        if(con.equals("")){
            System.out.println("loi ket noi");
        }
        else {
            System.out.println("ket noi thanh cong");
        }
                
                
    }
}
