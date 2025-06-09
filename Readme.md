#Steps for JDBC

/*
1. import package
2. load and register driver
3. create connection
4. create statement
5. execute statement
6. process the results
7. close
   */

-Statement && Prepared Statement are used
to conntect 
-Statement:
        Statement st= con.createStatement();        // con is object of connection class
        st.execute(query)

-PreparedStatement:
        PreparedStatement ps= con.preparedStatement(query);
        ps.execute()


Method	          ReturnType	          Usage Example
.execute()	      boolean	              For unknown result types
.executeQuery()	  ResultSet	            For SELECT queries
.executeUpdate()	int (rows affected)  	For INSERT, UPDATE, DELETE

        
