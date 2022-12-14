//oracle db connectivity

import java.sql.*;
import java.io.*;
class O1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");

			while(rs.next())
			{
				System.out.println("Id :" +rs.getInt(1));
				System.out.println("Name :" +rs.getString(2));
				System.out.println("Job :" +rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
