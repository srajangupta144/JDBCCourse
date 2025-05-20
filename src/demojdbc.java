import java.sql.*;                  //imported


public class demojdbc {
    /*
   1. import package
   2. load and register driver
   3. create connection
   4. create statement
   5. execute statement
   6. process the results
   7. close
     */
    public static void main(String[] args) throws Exception{

        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String password="srajan";

        Class.forName("org.postgresql.Driver");    //optional
        Connection con=DriverManager.getConnection(url, uname, password);

        System.out.println("Connection completed");
    }


}
