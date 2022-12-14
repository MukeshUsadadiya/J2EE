//callable statement
//note : must create procedure in oracle after written this code in java
//insert record

import java.sql.*;
import java.io.*;
class O11
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		Connection cn;
		int id;
		String nm,mno,em,ct;

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");

			System.out.print("Enter Id :");
			id = Integer.parseInt(System.console().readLine());
			System.out.print("Enter Name :");
			nm = System.console().readLine();
			System.out.print("Enter Moblie :");
			mno = System.console().readLine();
			System.out.print("Enter Email :");
			em = System.console().readLine();
			System.out.print("Enter City :");
			ct = System.console().readLine();
			
			cs1 = cn.prepareCall("{Call pro3(?,?,?,?,?)}");
			cs1.setInt(1,id);
			cs1.setString(2,nm);
			cs1.setString(3,mno);
			cs1.setString(4,em);
			cs1.setString(5,ct);
			cs1.executeUpdate();
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
