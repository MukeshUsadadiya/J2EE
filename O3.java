//oracle db connectivity (insert record in to created table)

import java.sql.*;
import java.io.*;
class O3
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");
			Statement st = cn.createStatement();
		
			st.execute("insert into mk1 values(2,'BBB','Rajkot')");
			st.execute("select * from mk1"); 	
			ResultSet rs = st.getResultSet();

			while(rs.next())
			{
				System.out.println("Roll no :" +rs.getInt(1));
				System.out.println("Name :" +rs.getString(2));
				System.out.println("City :" +rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
