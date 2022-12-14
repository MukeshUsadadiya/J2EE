//PHP connectivity 

import java.sql.*;
import java.io.*;
class P1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from stud");

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
		 