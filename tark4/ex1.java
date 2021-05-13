package tark4;

import java.sql.*;

public class  ex1{
    public static void main(String[] args){
        try(
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt=conn.createStatement();
        ){
            String select1 = "select title,price from books where author = 'CodeLean VN'";
            System.out.println("The SQL statement is :"+select1+"\n");
            ResultSet s1set = stmt.executeQuery( select1 );

            System.out.println("Print out a list price title ");
            while (s1set.next()){
                String title = s1set.getString("title");
                double price = s1set.getDouble("price");
                System.out.println(title + ", " + price );
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
