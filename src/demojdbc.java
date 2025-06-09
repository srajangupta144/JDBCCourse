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
        String query="delete from student where sid=4";           //chnge acc to operations needed

        Class.forName("org.postgresql.Driver");    //optional
        Connection con=DriverManager.getConnection(url, uname, password);  //Connection is made using Connection interface
        System.out.println("Connection completed");
        Statement st= con.createStatement();            // Create Statement in the connection as it is an interface

        st.execute(query);
        //FOR GET DATA QUERIES
        /*       ResultSet res= st.executeQuery(query);          //Statement return ResultSet
//        res.next();                                     //ByDefault the position of index for row of ResultSet if before the data so to make it from first
//        String name=res.getString("sname");     // column name is given
//        System.out.println("Name of Student is:"+name);

        while(res.next()){
            System.out.print(res.getInt(1)+" - ");
            System.out.print(res.getString(2)+" - ");
            System.out.println(res.getInt(3));
        }

  */



        con.close();                            // connection close
        System.out.println("Connection Closed");

    }


}
