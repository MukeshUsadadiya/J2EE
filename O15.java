//Database metadata

import java.sql.*;
import java.io.*;
class O15
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");
			
			DatabaseMetaData md = cn.getMetaData();
			
			System.out.println("Database Product Name    :" +md.getDatabaseProductName());
			System.out.println("Database Product Version  :" +md.getDatabaseProductVersion()); 
			System.out.println("Database Driver Name      :" +md.getDriverName());
			System.out.println("Database User Name 	  :" +md.getUserName());

			System.out.println("Database Catalog Name :");
			ResultSet rs= md.getCatalogs();
			while(rs.next())
			{
				System.out.println("Name :" +rs.getString(1));
			} 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
