/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconn;

/**
 *
 * @author Babu
 */
import java.sql.*;

public class JdbcConn {
   public static void main(String[] args) throws Exception {
       try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube?zeroDateTimeBehavior=convertToNull","root","");
      CallableStatement stmt = null;
      String sql = "{call youtube.fetch()}";
      stmt = con.prepareCall(sql);
      
      System.out.println("Executing stored procedure..." );
     // stmt.execute();
     // String query ="SELECT a.user_id,b.video_name from user_profile a inner join uploaded_videos b on a.user_id = b.user_id";
     ResultSet rs = stmt.executeQuery();
      System.out.println("Id  VideoName");
      
      while (rs.next()) {
         int uid = rs.getInt("user_id");
         String vname = rs.getString("video_name");
         System.out.println(uid + "    " + vname);
    }
       }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }

//        int uid = stmt.getInt("user_id");
//        String vname = stmt.getString("video_name");
//        System.out.println(uid + "  " + vname);
      System.out.println();
      System.out.println();
   }
}
