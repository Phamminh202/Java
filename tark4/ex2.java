package tark4;

import java.sql.*;

public class  ex2{
    public static void main(String[] args){
        try(
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt=conn.createStatement();
        ){
            String select = "select title,author,price,qty from books where author = 'CodeLean VN' or price>=30 order by price desc,id asc";
            System.out.println("The SQL statement is :"+select+"\n");
            ResultSet tset = stmt.executeQuery( select );

            System.out.println("Print out a list ");
            int rowCount3 = 0;
            while (tset.next()){
                String title = tset.getString("title");
                String author= tset.getString( "author" );
                double price = tset.getDouble("price");
                int    qty   = tset.getInt("qty");
                System.out.println(","+title + ", "+author+"," + price + ", " + qty);
                ++rowCount3;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
