//PHP connectivity 

import java.sql.*;
import java.io.*;
class P2
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ty22","root","");
			Statement st = cn.createStatement();

			st.execute("create table mk(rno int,name varchar(20),city varchar(20))");	
			st.execute("insert into mk values(1,'AAA','junagadh')");
			st.execute("select * from mk"); 	
			ResultSet rs = st.getResultSet();

			while(rs.next())
			{
				System.out.println("Id :" +rs.getInt(1));
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
		 