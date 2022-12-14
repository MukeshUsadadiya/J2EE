//Database metadata

import java.sql.*;
import java.io.*;
class P4
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","");
			
			DatabaseMetaData md = cn.getMetaData();
			
			System.out.println("Database Product Name :" +md.getDatabaseProductName());
			System.out.println("Database Product Version :" +md.getDatabaseProductVersion()); 
			System.out.println("Database Driver Name :" +md.getDriverName());
			System.out.println("Database User Name :" +md.getUserName());

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
