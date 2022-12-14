//access connectivity 

import java.sql.*;
import java.io.*;
class A1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection cn = DriverManager.getConnection("jdbc:ucanaccess://F:/MY-WORK/TY-2022/J2EE/Database.accdb");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");

			while(rs.next())
			{
				System.out.println("Id :"+rs.getInt(1));
				System.out.println("Name :"+rs.getString(2));
				System.out.print("Job :"+rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
	}
}	