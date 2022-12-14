//Access Connectivity (insert)

import java.sql.*;
import java.io.*;
class A2
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection cn = DriverManager.getConnection("jdbc:ucanaccess://F:/MY-WORK/TY-2022/J2EE/Database.accdb");

			Statement st = cn.createStatement();
			st.execute("insert into mk values(4,'AAA','Keshod')");
			st.execute("select * from mk"); 	
			ResultSet rs = st.getResultSet();

	
			while(rs.next())
			{
				System.out.println("Id :"+rs.getInt(1));
				System.out.println("Name :"+rs.getString(2));
				System.out.print("City :"+rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
	}
}	