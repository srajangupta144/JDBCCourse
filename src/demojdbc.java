import java.sql.*;                  //imported


public class demojdbc {

    public static void main(String[] args) throws Exception{
        int sid= 100;                       //directly can take user input
        String sname= "Hero";
        int marks= 90;

        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String password="srajan";
        String query="insert into student values (?,?,?) ";           //change acc to operations needed

        Class.forName("org.postgresql.Driver");    //optional
        Connection con=DriverManager.getConnection(url, uname, password);  //Connection is made using Connection interface
        //For PreparedStatement
        PreparedStatement ps= con.prepareStatement(query);

        ps.setInt(1,sid);
        ps.setString(2,sname);
        ps.setInt(3,marks);

        ps.execute();

//        Statement st= con.createStatement();            // Create Statement in the connection as it is an interface
//        st.execute(query);
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
//        System.out.println("Connection Closed");

    }


}
