
package database;
//import java.sql.*;
//public class Database{
//    public static void main(String args[])throws Exception
//    {
//        Class.forName("org.sqlite.JDBC");
//        Connection con= DriverManager.getConnection("jdbc:sqlite:c://sqlite//univ");
//        Statement stm=con.createStatement();
//        ResultSet rs=stm.executeQuery("select * from students");
//        while(rs.next()){
//            System.out.print(rs.getInt("rollno")+" ");
//            System.out.print(rs.getString("name")+" ");
//            System.out.print(rs.getString("city")+" ");
//            System.out.println(rs.getInt(4)+" ");
//        } 
//        stm.close();
//        con.close();
//    }
//}

//PREPARED STATEMENT //
//import java.sql.*;
//import java.util.*;
//public class Database{
//    public static void main(String args[])throws Exception
//    {
//        Class.forName("org.sqlite.JDBC");
//        Connection con= DriverManager.getConnection("jdbc:sqlite:c://sqlite//univ");
//        PreparedStatement stm=con.prepareStatement("select * from Students where deptno=?");
//        Scanner sc=new Scanner(System.in);
//        int dno=sc.nextInt();
//        stm.setInt(1,dno);
//        ResultSet rs=stm.executeQuery();
//        while(rs.next()){
//            System.out.print(rs.getInt("rollno")+" ");
//            System.out.print(rs.getString("name")+" ");
//            System.out.print(rs.getString("city")+" ");
//            System.out.println(rs.getInt(4)+" ");
//        } 
//        stm.close();
//        con.close();
//    }
//}

//DML USING JDBC//
//   import java.sql.*;
//public class Database{
//    public static void main(String args[])throws Exception{
//        Class.forName("org.sqlite.JDBC");
//        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
//        Statement stm=con.createStatement();
////        stm.executeUpdate("insert into dept values(70,'chem')");
////        stm.executeUpdate("Delete from dept where deptno>=30");
//          stm.executeUpdate("update dept set dname='mech' where deptno=20"); 
//        stm.close();
//        con.close();
//    }
//}

//     INSERT OPERATION BY USER //

//       import java.sql.*;
//       import java.util.*;
//public class Database{
//    public static void main(String args[])throws Exception{
//        Class.forName("org.sqlite.JDBC");
//        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
//        PreparedStatement stm=con.prepareStatement("insert into students values(?,?,?,?)");
//        
//        Scanner sc=new Scanner(System.in);
//        System.out .println("enter student data");
//        int r=sc.nextInt();
//        String name=sc.next();
//        String city=sc.next();
//        int dno=sc.nextInt();
//        
//        stm.setInt(1,r);
//        stm.setString(2,name);
//        stm.setString(3, city);
//        stm.setInt(4, dno);
//        
//        stm.executeUpdate();
//
//        stm.close();
//        con.close();
//    }
//}

//CREATE AND DROP TABLES//


   import java.sql.*;
public class Database{
    public static void main(String args[])throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
        Statement stm=con.createStatement();
//        stm.executeUpdate("create table temp(a integer,b float)");
          stm.executeUpdate("drop table temp");
          
        stm.close();
        con.close();
    }
}



