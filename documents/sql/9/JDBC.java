import java.sql.*;
import java.util.logging.Logger;

public class JDBC {

    public static void main(String args[]){
      try{
//  STEP 1
        Class.forName("com.mysql.jdbc.Driver");
//  STEP 2
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mysql","root","root");
// STEP 3
//        Statement stmt=con.createStatement();
//
//
//        stmt.executeUpdate("insert INTO mysql.emp VALUES (1,'ADITYA','THIS IS BLOB')");
//        ResultSet rs =   stmt.executeQuery("Select * from mysql.emp");
//        System.out.println(rs.toString());
//        while(rs.next()) {
//            System.out.println(rs.getInt(1) + "  " + rs.getString(2));
//        }
//          con.commit();

          PreparedStatement stmtP =con.prepareStatement("insert into Emp values(?,?,?)");
          stmtP.setInt(1,101);
          stmtP.setString(2,"Ratan");
          stmtP.setString(3,"Ratan BLOB");

          int i=stmtP.executeUpdate();
           System.out.println("ROws Updated::"+i);
        con.close();
      }catch(Exception e){ System.out.println(e);}
    }

    void Class(){
      System.out.println("In Class");
     }
  }




//https://sqliteonline.com/#sharedb=s%3Ater