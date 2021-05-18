import java.sql.*;
import java.util.Scanner;

public class JdbcInsertTest {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        try(
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt=conn.createStatement();
                ){
            //Delete records with id>=300 and id<4000
            String sqlDelete="delete from books where id>=300 and id<4000";
            System.out.println("The SQL statement is: "+sqlDelete+"\n");
            int countDelete=stmt.executeUpdate(sqlDelete);
            System.out.println(countDelete+" records delete.\n");

            //Insert a record
            String sqlInsert="insert into books values(3001,'Gone Fishing','Kumar',11.11,11";
            System.out.println("The SQL statement is: "+sqlInsert+"\n");
            int countInserted=stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+" records inserted.\n");

            //insert multiple records
            sqlInsert="insert into books values "
                    +"(3002,'Gone Fishing 2','Kumar',22.22,22),"
                    +"(3003,'Gone Fishing 3','Kumar',33.33,33)";
            System.out.println("The SQL statement is: "+sqlInsert+"\n");
            countInserted=stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+ " records inserted.\n");

            //insert a partial record
            sqlInsert="insert into books(id,title,author) values(3004,'Fishing 101','Kumar')";
            System.out.println("The SQL statement is: "+sqlInsert+"\n");
            countInserted=stmt.executeUpdate(sqlInsert);
            System.out.println(countDelete+" records inserted.\n");

            //issue a select to check the changes
            String strSelect="select * from books";
            System.out.println("The SQL statement is: "+strSelect+"\n");
            ResultSet rset=stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("id")+","
                +rset.getString("author")+","
                +rset.getString("title")+","
                +rset.getDouble("price")+","
                +rset.getInt("qty"));
            }

            //BT1
            //1
            String sqlDeletebt1="delete from books where id>8000";
            System.out.println("The SQL statement is: "+sqlDeletebt1+"\n");
            countDelete=stmt.executeUpdate(sqlDeletebt1);
            System.out.println(countDelete+ " records delete.\n");

            //2
            String sqlInsertbt1="insert into books values"
                    +"8001,'Java Core','Dang Kim Thi',15.55,55"
                    +"8002,'Java Advanced','Jame Gosling',25.55,55";
            System.out.println("The SQL statement is: "+sqlInsert+"\n");
            countInserted=stmt.executeUpdate(sqlInsertbt1);
            System.out.println(countInserted+ " records inserted.\n");

            //3
            sqlInsert="insert into books(id,title,author) values (2001,'Java JDBC MYSQL','ThiDK')";
            System.out.println("The SQL statement is: "+sqlInsert+"\n");
            countInserted=stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+ " records inserted.\n");

            //4
            System.out.println("Enter id: ");
            int id=Integer.parseInt(scanner.nextLine());
            sqlDelete="delete from books where id="+id;
            countDelete=stmt.executeUpdate(sqlDelete);
            System.out.println(countDelete+ " records delete.\n");

            //5
            System.out.println("Add a new book:");
            System.out.println("Enter id: ");
            int id2=Integer.parseInt(scanner.nextLine());
            System.out.println("Enter title: ");
            String title=scanner.nextLine();
            System.out.println("Enter author: ");
            String author=scanner.nextLine();
            System.out.println("Enter price: ");
            String price=scanner.nextLine();
            System.out.println("Enter qty: ");
            String qty=scanner.nextLine();
            sqlInsert="insert into books(id,title,author,price,qty) value(?,?,?,?,?)";
            countInserted=stmt.executeUpdate(sqlInsert);
            System.out.println(rset.getInt("id")+","
                    +rset.getString("author")+","
                    +rset.getString("title")+","
                    +rset.getDouble("price")+","
                    +rset.getInt("qty"));
            System.out.println(countInserted+ " records inserted.\n");

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
