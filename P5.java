//record display using procedures 

import java.sql.*;
import java.io.*;
class P5
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ty22","root","");
			
			cs1 = cn.prepareCall("{call pro1()}");
			ResultSet rs= cs1.executeQuery();
			while(rs.next())
			{
				System.out.println("Id :" +rs.getInt(1)+"\tName :"+rs.getString(2));
			} 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
