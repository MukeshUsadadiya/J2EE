//record delete  using procedures 

import java.sql.*;
import java.io.*;
class P6
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ty22","root","");
			System.out.print("Enter Id :");
			int no = Integer.parseInt(System.console().readLine());

			cs1 = cn.prepareCall("{call pro2(?)}");
			cs1.setInt(1,no);
			cs1.executeUpdate(); 
			System.out.println("Record Delete Successfully");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
