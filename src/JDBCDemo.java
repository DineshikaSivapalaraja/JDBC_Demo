import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException  { //SQLException--> Exception
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "";
		String query = "select * from employee";//define query
		
		
		Connection con = DriverManager.getConnection(url, userName, passWord);//connection establish //con is object
		Statement st = con.createStatement();//to execute queries-.statement
		ResultSet rs = st.executeQuery(query);//result to query execution
	
	    while(rs.next()) {
	    System.out.println("Id is "+ rs.getInt(1));  //1,2,3 getInt(1) --> 1: column no
	    System.out.println("Name is "+ rs.getString(2));
	    System.out.println("Salary is "+ rs.getInt(3));
	    }
	    con.close();
	}

}
